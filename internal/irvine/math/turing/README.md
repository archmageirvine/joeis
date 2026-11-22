# Busy Beaver verification

`BusyBeaver` enumerates binary machines in tree normal form and computes
the step and score maxima (A060843 and A028444) for one to five working states.
It is an opt-in internal utility, not part of normal sequence evaluation.

From the repository root:

```sh
ant compile-internal
java -cp build.tmp/classes irvine.math.turing.BusyBeaver 4
java -Xmx288m -cp build.tmp/classes irvine.math.turing.BusyBeaver 5 internal/irvine/math/turing/busy-beaver5.dat.gz
```

To compile only the checker, use
`javac --release 11 -d build.tmp/classes internal/irvine/math/turing/*.java`
in place of the Ant command. The checker has no dependencies outside the JDK.

The five-state run visits 181,385,789 tree nodes. It fails if any node is
unresolved or the traversal reaches its safety cap. The program simulates
halting computations and checks nonhalting certificates; it does not read
preclassified enumeration results. The last step writes a 1 in the
tree-normal-form convention. See the [bbchallenge paper][paper] for the
normalization and enumeration argument. This implementation is an
independent Java check, not a Rocq proof or a replacement for it.

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

[paper]: https://arxiv.org/abs/2509.12337
[coq]: https://github.com/ccz181078/Coq-BB5/tree/b295161e830cfb0698e6eff667afce8917ca1423/CoqBB5/BB5
[roster]: https://docs.bbchallenge.org/CoqBB5_release_v1.0.0/
[license]: ../../../../licenses/busy-beaver-license.txt
[xu]: https://arxiv.org/abs/2407.02426
