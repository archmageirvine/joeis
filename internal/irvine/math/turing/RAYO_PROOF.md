# Exact-length Rayo names through 30 symbols

[A368006](https://oeis.org/A368006) asks for a formula with one free
variable in the language of equality and membership. Its quantifiers
range over the entire universe of sets. The check below uses foundation,
extensionality, and the existence of finite sets with specified elements
and of sets of arbitrarily high rank. It does not interpret the formula
in a small finite universe.

## Quantifier depth at most two

For a fixed root (the value of the free variable), a one-variable
extension has an atomic diagram and a list of the possible diagrams on
adding one more variable. Quantification is exactly disjunction over
the extensions. Negation and conjunction act pointwise. Consequently,
bottom-up enumeration by symbol count can identify two subformulas
whenever their truth tables are equal on these types. Bound variables
are renamed to avoid shadowing. Vacuous quantifiers may alternatively
be erased and their four-symbol cost carried as padding.

For a finite ordinal root x, the possibilities for the first new value
y are y=x, y in x, and neither. In the first two cases, an additional
value z equal to x or y is handled directly. If z is a different member
of x, its relations to an ordinal y in x depend just on whether it is
below or above y. The possibilities for the position of y stabilize
at x=3 (first, last, or strictly between). All other z can have any
combination of containing x and y, subject to x=y: use a fresh element
of higher rank as an additional member of z.

For y outside x and not equal to x, record whether y contains x,
whether its intersection with x and its complement within x are
nonempty, and whether it has an element not equal to x or a member of
x that does or does not contain x. This determines every possible
one-element extension: a member of x cannot contain y, and a member
of y cannot contain y. The flags are freely realizable except for the
size of x and the case that would give y=x. Construct y by choosing
a subset of x, optionally x itself, and fresh elements of either
incidence with x. The same argument about fresh higher-rank sets
handles z outside both sets. Thus the root types for x=0,1,2 and x>=3
are exact, not a finite-model approximation.

The verifier also uses the nonordinals in V_4 as additional
counterwitnesses. For each such fixed root x use its finite transitive
closure, including x. A y in the closure is explicit. An outside y
has an arbitrary subset of that closure as members, plus optional
extra members of either incidence with x. Each subset and flag
combination is realizable by the same fresh-element construction,
except that a subset without extras must not reproduce a set already
in the closure. As before, z outside both sets is handled by adding a
fresh higher-rank element. This gives exact truth at each tested
nonordinal, without assuming these are all possible counterwitnesses.

A candidate for a unique natural-number name must be true at exactly
one of the singleton ordinal root types (0, 1, or 2) and false at
every other tested root. A formula true on the last ordinal type is
true at infinitely many ordinals and cannot name a single one.

## Greater depth at this symbol budget

For a formula with a atoms, q quantifiers and k negations the length
is 6a-3+4q+3k. With at least three essential nested binders and
length at most 30 there are at most three atoms. With two atoms and
three essential binders, all four variables occur once, so the atoms
involve disjoint pairs. Move each quantifier inwards across the
connectives that do not use its variable, changing polarity when
passing a negation. The closed pair contributes a truth constant.
The pair containing x gives a constant or just tests whether x is
empty: existential or universal membership and equality with a
single other variable have no further distinction on ordinals.
Thus only 0 can be named. When there are no negations, even 0 is
not isolated by this argument, since the formula is positive
existential.

For use below, any witnessed existential atomic diagram with the
root equal to a finite ordinal m can be realized with the root equal
to any larger finite ordinal. Preserve the values of all other
vertices lying below the root: these are themselves smaller ordinals.
If necessary, include the empty set as a fixed anchor. Quotient by
the equalities. The membership diagram is acyclic. Realize each
remaining vertex in a membership order as the set of its prescribed
members, with a distinct fresh high-rank tag to ensure that no
unrequested equality or membership is introduced. No remaining
vertex is a member of a fixed ordinal in the diagram. This construction
preserves negative atoms as well. In particular, a purely existential
formula (even with negatives in its matrix) cannot isolate an ordinal.

With three atoms and three essential binders the length is 27 or 30.
At length 27 there is no negation. At length 30 there is one. Put
the latter formula in the form

    exists outer [ P and not exists inner Q ],

where P and Q are conjunctions of positive atoms. This just pulls
existentials outside their subformulas after renaming; those within
the negation stay inside. If the atom graph is disconnected, the
components without x contribute only closed existence tests. In
this normal form: if their positive P is impossible, the formula
is false; if their P can hold and their Q fail, the negation is
unnecessary; otherwise, retain only the negation of the Q in x's
component. The component containing x then has at most two essential
binders, so it is covered by the earlier check at some length at
most 30. Otherwise, the graph is connected on four variables with
three edges, hence is a tree. An equality in P can be substituted
out; an equality in Q can also be substituted out if it has an inner
endpoint. These cases reduce to at most two binders.

The remaining tree cases show that no formula can name an ordinal
at least 2:

- If there are no inner variables, the existential diagram transfer
  above applies.
- If P is empty, consider when Q can hold for every assignment to
  the outer variables. An equality between fixed vertices, or an
  edge requiring an outer variable to contain something, immediately
  gives an assignment making Q false (assign distinct values, or
  assign the empty set, respectively). So does a directed membership
  path from an outer variable up to x (assign that variable a high
  rank). In all other cases the only requirement is that there be
  enough ordinals below x for the longest chain directed into it.
  Place those vertices by their heights in the directed graph;
  create the remaining inner sets bottom-up, including the fixed
  outer elements as prescribed. Q then holds for every outer
  assignment exactly on an upward-closed ordinal range. Negating
  this condition gives a downward-closed range, not a singleton
  ordinal at least 2. The same reasoning includes no outer variables.
- If P is nonempty and two variables are inner, P joins x to the
  sole outer variable y. The forest of Q is anchored separately at
  x and y: a path joining them would make a cycle with P. Each
  component requires a downward chain of length at most two at
  its anchor, or is unconditionally realizable by making containing
  sets. For x>=2 these tests on x are constant. If y belongs to x,
  keep its old ordinal value when increasing x. If x belongs to y,
  the tests on y are always satisfied for x>=2. The spectrum cannot
  have a finite isolated value at least 2.
- Finally let P be nonempty with just one inner variable. If that
  variable is a leaf of the atom tree, its existential atom in Q
  reduces either to a nonemptiness test of its parent or to truth.
  The remaining condition uses just atomic and emptiness tests on
  the outer variables, covered by diagram transfer with 0 fixed.
  Otherwise Q consists of the two edges through the inner variable
  and P has one edge attaching the third fixed vertex. Both edges
  pointing into the inner variable give unconditional existence.
  The other possibilities test whether the two fixed endpoint sets
  intersect, or whether one endpoint belongs to the union of the
  other. If the endpoint unused by P is quantified, choose it
  empty for an intersection or union-container test, and high-rank
  when it must avoid belonging to a union. This makes Q false
  without affecting P. If the unused endpoint is x, choose the other
  endpoint disjoint from x, with empty union, or of high rank,
  respectively. It can be nonempty if P requires it: a fresh
  singleton, the singleton of the empty set, or a high-rank set
  suffices. The third vertex can then be assigned to satisfy the
  single edge in P. These cases reduce to existence of the P edge
  or a constant, again not an isolated value at least 2.

This accounts for all essential-depth cases. The program applies the
resulting upper bound at each compatible symbol count, without using
OEIS terms as input.

## Matching lower bounds

The empty set has its usual 10-symbol definition. A second, of length
19, adds the tautological guard that the would-be element does not
belong to itself. Two negations and a vacuous quantifier are padding of
length six and four. The 30-symbol definition of 1 says that x has a
member and that none of its members has a member. These formulas
characterize the sets in the full universe. The program constructs
their lengths by the grammar, propagates the padding, and requires
agreement with all upper bounds before it returns terms.
