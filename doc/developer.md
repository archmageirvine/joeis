jOEIS
=====

Some brief notes for developers.

Sequence Implementations
------------------------

The sequence A123456 is implemented in the class file located at

```
src/irvine/oeis/a123/A123456.java
```

All sequence implementations must (ultimately) implement `irvine.oeis.Sequence`, which
provides a single method `next()`.  Of course, this implementation can be
indirect, by extending some other class which in turn implements `Sequence`.

There are a number of transforms available in `irvine.oeis` that are useful
for chaining together existing implementations.  Also in the package are
some useful base classes like `LinearRecurrence`, `FiniteSequence`,
`DecimalExpansionSequence`, `SkipSequence`, etc., that are useful for constructing
common types of sequence or for making simple modifications to existing sequences.

There is also `MemorySequence` for situations where remembering previously
generated terms of a sequence is important (e.g. for fast computation).  Any
sequence can be turned into such a sequence via

```
MemorySequence memSeq = MemorySequence.cachedSequence(seq)
```

In general there should be no other classes (non-sequence implementations)
in the `annn` subdirectories.  Other new support code, can be added into
appropriate locations in `irvine/math`, etc.

Tests
-----

The JUnit 3 testing framework is used.  Most of the utility classes have a
corresponding test class with all the tests linked together via `AllTests.java`
in the various packages.

There used to be a unit test class for every sequence file as well, but the
vast majority of these were essentially empty and we removed.

Testing of the invidual sequences can be done by `AbstractSequenceTest`,
and when tests are invoked from the top-level, this class is used to run
a test on each sequence in turn.

Style Guidelines
----------------

The style of the code files including spelling is checked on a daily basis
using a continuous integration system.  The style rules generally follow
the Sun Java style guide, with the following specifics:

* Indentation is 2 spaces (no tabs).

* The class comment should start with the sequence number and contain
  appropriate "@author" tag(s).  These comments are processed by the
  javadoc system, so must be valid for that purpose.  For example, "<"
  must be escaped as "&lt;", etc.  Appropriate <code> tags and similar
  should be used where appropriate.

* Member variables match the pattern m[A-Z][A-Za-z0-9]*

* Class variables match the pattern [A-Z][A-Z0-9_]*

* Local variables match the pattern [a-z][A-Za-z]*

* Abstract classes have names starting with Abstract.

* Methods should be private unless actually needed for implementation of
  multiple sequences.

* The "final" keyword should be used whereever it is allowed.

* When splitting an expression across lines, the operator is carried to
  the next line.

Implementation Hints
--------------------

The best option is probably to find a similar already implementd sequence
as a starting point.  Simply copy the class, update the documentation
and change the implementation.  Make sure the right package is being used;
that is, make sure the implementation of `Axxxyyy.java` is in the `axxx`
package.

The field name `mN` is generally used to reflect the index of the term
to generate (although there are exceptions).  `mN` can be `int`, `long`,
or `Z` depending on whichever is easiest or most appropriate for a given
sequence.

For sequences requiring stepping over primes, the `Fast` class provides a
sieve-backed sequence of primes.  For factorization use the `Cheetah` class
if only "small" factorizations are required; otherwise perhaps `Jaguar`
which will consult `factordb.com`.

The integers are not a field of course, but there is a class `IntegerField`
which allows you to operate as if they are.  It will do truncating division.
This is helpful, if you're wanting to work over polynomials.  For example,
the following line is common in many sequences using a generating function
approach:

```
private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
```

Actually the above variable would be better called `FIELD` rather than `RING`, but
the above is way more common usage in the current code.

Some sequences support verbose output.  The recommended mechanism is using the
property `oeis.verbose` which can be accessed as

```
private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
```

Often sequences are based on triangles or other functions with multiple arguments.
Sometimes it is desirable to cache results of such functions (equivalent to Maple
`remember`).  There are various classes like `MemoryFunction2` that can assist
with this.


