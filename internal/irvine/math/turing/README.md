# Busy Beaver verification

`BusyBeaver` enumerates binary machines in tree normal form for one to five
working states. It computes the step and score maxima (A060843 and A028444),
the labeled halter count (A004147), the sum of halting times (A386859), and
the maximum halting time leaving a blank tape (A119683). The five-state
run is opt-in; ordinary sequence evaluation computes the one- through
four-state terms and uses the verified five-state values as a shortcut.

From the repository root:

```sh
ant compile-internal
java -cp build.tmp/classes irvine.math.turing.BusyBeaver 4
java -Xmx288m -cp build.tmp/classes irvine.math.turing.BusyBeaver 5 internal/irvine/math/turing/busy-beaver5.dat.gz
```

The Turing-machine and Minsky checkers need only the JDK. To compile just
those tools without Ant (the separate Antihydra verifier uses jOEIS `Z`):

```sh
javac --release 11 -sourcepath src -d build.tmp/classes \
  $(find internal/irvine/math/turing -name '*.java' ! -name AntihydraMinima.java) \
  src/irvine/math/turing/AlphabetBusyBeaver.java src/irvine/math/turing/MinskyBusyBeaver.java
```

The five-state run visits 181,385,789 tree nodes. It fails if any node is
unresolved or the traversal reaches its safety cap. The program simulates
halting computations and checks nonhalting certificates; it does not read
preclassified enumeration results. The last step writes a 1 in the
tree-normal-form convention. See the [bbchallenge paper][paper] for the
normalization and enumeration argument. This implementation is an
independent Java check, not a Rocq proof or a replacement for it.

The same run collects the set of halting times for A337805 and emits
short halting-machine witnesses for the small scores in A399346. The
sequence class replays those machines and checks the lower bound from
the smaller-state maxima. For a separate bounded time search, use
`java -cp build.tmp/classes irvine.math.turing.LazyBeaver 4 128`.
That tool accepts a state count and time horizon; it rejects a capped
enumeration or a horizon with no missing time.
For the six-state published term, `LazyBeaver --parallel 6 8407 64` partitions the
same tree at depth five and unions the attained-time sets. It does not
classify a machine beyond the time horizon or assume an expected gap.
The complete run visited 49,026,426,353 nodes in 19,896 branches and
found that the first missing time was 8,407. It took about 47 minutes
on the verification host. The default A337805 iterator caches only
the expensive five- and six-state terms.
To regenerate the least-state counts for A125269 up to a finite horizon,
use `java -cp build.tmp/classes irvine.math.turing.LazyBeaver --least-states 626`.
This enumerates the halting times through five states, then obtains
witnesses for the remaining times using a larger state budget.
The normal sequence caches only the times requiring six states within
that verified horizon. The verifier does not read the cache.

The gzip file is sorted ASCII with one record per exceptional machine.
Each line contains the machine in standard bbchallenge notation, the
decider and its parameters, and, for FAR/WFAR, transition tables with
colon-separated entries and semicolon-separated rows. It has no verdict
or score column.
The parameters and automata come from the `BB5_Deciders_Hardcoded_Parameters`
and `BB5_Sporadic_Machines.v` files of [Coq-BB5 v1.0.0][coq].
The 8,228 records were cross-checked against the [release roster][roster];
the SHA-256 of the uncompressed file is
`fc6d4b23033a9010ca739424f2705e5f3058e526d8c67756952df86cb0a05bea`.
The data and adapted checks retain the [upstream MIT notices][license].
The sporadic checks follow the BusyCoq proofs and the Coq-BB5 proof
outline for Skelet #17; see also [Chris Xu's analysis][xu] and
[`skelet-17.txt`](skelet-17.txt).

## Register machines

`java -cp build.tmp/classes irvine.math.turing.MinskyBusyBeaver 8`
checks the step and final-register maxima for eight instructions in the
model of [A081419][register-score] and [A401603][register-steps].
The instruction count includes a single HALT; the step count excludes it.
Both sequence classes compute the earlier terms and use the verified
eight-instruction results as shortcuts.
The checker names instructions and registers in discovery order and
assigns branch targets only when first taken. A missing instruction can
either halt or use one more instruction from the budget. It rejects a
search with unresolved branches or a reached limit; an ordinary
simulation timeout does not prove nonhalting.

For A118874 the Cutland decoder computes all 99 published indices. The
one comparison difference is the pending OEIS correction at n=63:
the program T(2,1) copies the initially zero R2 into the output register,
giving 1 after the sequence's increment. The iterator does not store
either the original published term or its replacement.

## Antihydra

A398746 keeps the published finite-horizon interpretation; it does not
claim to decide starts excluded from the conjectural list. A385150 counts
exact first-halting times, which needs no unbounded nonhalting decision.
Its 35 expensive minima are verified cache entries; the other 66 values
in the published range share a live increasing scan. With the internal
classes compiled, regenerate the entire cache without reading it:

```sh
java -cp build.tmp/classes irvine.math.turing.AntihydraMinima 100 200000000000 32
```

This is a long, parallel verification run; use an appropriate compute
budget. The sequence class also has an uncached `A385150(false)` iterator.

## Larger alphabets

`java -cp build.tmp/classes irvine.math.turing.AlphabetBusyBeaver 4`
checks the step and score maxima for two states and four tape symbols.
This is the same enumeration used by A398770 and A399567; neither has
a table of terms. The decider schedule follows the [Rocq 2-by-4 check][bb24].

The same search computes A384629 and A384766 through six instructions
with a sparse table and no extra halting action. To regenerate both
seven-instruction cache values (about 31 seconds in the timing check):

```sh
java -cp build.tmp/classes irvine.math.turing.AlphabetBusyBeaver --instructions 7 --published-count
```

The switch opts into the cumulative halter count in the [published
instruction-limited census][bbi], not either maximum. Java simulates all
264,055,010 halters it finds, checks that the count agrees, and derives
both maxima from the runs. A separate strict audit supplies no count:
it matches its eight holdouts to two checked automata, five
parameterized tape-rewrite proofs and a fresh Coq replay of the last
case. The published-count switch remains an optional Java-only replay,
not a premise of the combined audit.
`SparseRotorWitness` replays the five tape-rewrite proofs with the
same affine tape interpreter used by `E78kWitness`. The last sparse
case still uses the independently kernel-checked Coq proof.

`E78kWitness` derives the six-state halting lower bound used in A362199.
It checks finite block crossings, the affine local rewrites, and the
geometric sums of their runtimes. The sequence iterator uses exact
arithmetic and no digit cache.

## Lambda calculus and Post correspondence

`BinaryLambdaCensus --maximum n` independently classifies the closed
terms through size 36. The same computation gives the maximum beta
normal-form size (A333479) and the count of normalizers
([A333958][normalizers]). It fails if any term is left unclassified.

```sh
java -cp build.tmp/classes irvine.math.BinaryLambdaCensus --maximum 35
java -cp build.tmp/classes irvine.math.BinaryLambdaCensus --maximum 36
java -cp build.tmp/classes irvine.math.graph.PcpInvariant internal/irvine/math/graph/pcp-width3.tsv
```

At size 36, of 11,148,652 closed terms, 11,112,179 normalize and 36,473
diverge. Neither the count nor the maximum is a premise. The two iterators
cache only the expensive sizes 35 and 36. A385712 uses A333479 as its
oracle and evaluates the one-free-variable terms instead of storing their maxima.

A361211 independently classifies all self-delimiting input programs
through size 32. Run `BinaryLambdaCensus --strict-bb2 32 30000`
to regenerate all maxima without a cache. Divergence certificates
include head-spine recurrences: after a positive weak-head step and
finitely many beta reductions, the same computation is still needed
on the head spine. The iterator caches only its expensive last term.

`PcpInvariant` runs the width-three census and checks all 65 residual
cases: 50 regular-language invariants, 14 invariants restricted to
possible solution residuals, and a marked-substring proof for [Rahn's
J16b][pcp]. It fails if a census holdout lacks a proof or a certificate
does not match a holdout. The certificate file contains the tile words,
reversal and restriction flags, and two DFA transition tables and final
sets. It contains no maximum. The exact Java run found 75 in about
26 seconds; the normal iterator caches only this verified term. The
`--rahn-horizon` command is a separate theorem-backed replay and is
not needed by the exact check.

## FRACTRAN and Wang tiles

A395424 computes the runtimes of [published FRACTRAN witnesses][fractran].
A separate reduced-program audit independently establishes maximality
through size 20, with a 746-step maximum. The internal
`FractranInvariant` checker independently replays the weighted exponent
invariants for the 56 final size-20 programs and the 391 six-rule
size-21 holdouts using integer arithmetic, without Z3. It accepts
tab-separated exponent changes, coefficient rows, and bounds. This
checker does not enumerate the programs. Replay the size-20 affine
certificates with:

```sh
java -cp build.tmp/classes irvine.math.turing.FractranInvariant internal/irvine/math/turing/fractran-size20-affine.tsv
```

The [ordered-gap quotient][fractran-gaps], independently implemented in
`FractranGapInvariant`, checks another eight size-21 cases. The final 27
have both an axiom-audited Lean proof and an independent Java replay:

```sh
java -cp build.tmp/classes irvine.math.turing.FractranMacroWitness
java -cp build.tmp/classes irvine.math.turing.FractranRegionalWitness internal/irvine/math/turing/fractran-size21-regions.tsv
```

The Java replay checks that the ordered FRACTRAN rules return every
state in an invariant region to that region after a positive number of
steps. For a repeated block it checks both endpoint copies, including
the guards that prevent every earlier rule from firing. Concrete runs
can suggest a block, but are not evidence for infinite execution. The
27 checked exponent tables match the remaining census roster, without
missing or duplicate programs.

`FractranCensus` independently enumerates the first-stage size-21 census
in Java; all ten rule-count classification totals match the native
census. `FractranQuotient` replays the next stage on its unresolved rows:

```sh
java -cp build.tmp/classes irvine.math.turing.FractranQuotient s21-r4.txt
```

The Java replay reduced the 19,642,097 census holdouts to the same exact
18,214 transition tables as the native quotient. All published terms
through size 21 are exact under the full mixed-language proof. Some
filters between the quotient and the final certificates have not been
ported. The normal Java iterator checks each attaining witness's runtime.

A402127 checks the [Wang-tile witnesses][wang] on both sides of the
requested size. An independent compatibility-matrix audit and exact
board replay rule out smaller sets for all published sides, including
the [seven-type exclusions][wang-bounds] at sides 13 and 17. The separate
`A402127.exhaustive(side)` entry point enumerates color partitions
without those bounds or witnesses; this becomes expensive as the size
grows.

## Exact-length Rayo names

A368006 computes all 31 published terms without storing them. See
[the derivation](RAYO_PROOF.md) for the exact diagrams for
quantifier depth at most two and the exhaustive symbol-budget
argument for the deeper cases.

[paper]: https://arxiv.org/abs/2509.12337
[coq]: https://github.com/ccz181078/Coq-BB5/tree/b295161e830cfb0698e6eff667afce8917ca1423/CoqBB5/BB5
[roster]: https://docs.bbchallenge.org/CoqBB5_release_v1.0.0/
[license]: ../../../../licenses/busy-beaver-license.txt
[xu]: https://arxiv.org/abs/2407.02426
[register-score]: https://oeis.org/A081419
[register-steps]: https://oeis.org/A401603
[bb24]: https://github.com/ccz181078/Coq-BB5/tree/b295161e830cfb0698e6eff667afce8917ca1423/CoqBB5/BB2x4
[bbi]: https://wiki.bbchallenge.org/wiki/Instruction-Limited_Busy_Beaver#Tree_Normal_Form_(TNF)_for_BBi
[normalizers]: https://oeis.org/A333958
[pcp]: https://publikationen.bibliothek.kit.edu/1000009979/614948
[fractran]: https://oeis.org/A395424/a395424.txt
[fractran-gaps]: https://github.com/int-y1/BBFractran/blob/0297a5c4aa330988cc0c499231b949e9d9fcf755/decider/graph_pdlm.py
[wang]: https://oeis.org/A402127/a402127_2.txt
[wang-bounds]: https://oeis.org/A402127/a402127.txt
