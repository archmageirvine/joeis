Development
===========

## Structure

The jOEIS has a simple structure with all source files in the `src`
hierarchy and all test files in the `test` hierarchy. There is a small
`internal` hierarchy for items not necessary for the main
implementations. The `lib` directory contains jar files for
all dependencies.  There is no external dependencies.

From an IDE (e.g., IntelliJ), it is easy to open the project directory
marking the appropriate directories as `src` or `test`.  However, due
to the total size of the project a reasonable amount of memory is
required for easy development.

## Sequence Implementations

The sequence A123456 is implemented in the source file located at

```
src/irvine/oeis/a123/A123456.java
```

All sequence implementations must (ultimately) implement
`irvine.oeis.Sequence`, which provides methods `next()`,
`getOffset()`, and `skip()`.

In addition, a sequence might also implement `DirectSequence` if it
supports direct access to the nth term of the sequence.

In practice, sequences only rarely directly implement the `Sequence`
interface. Usually they will extend from `AbstractSequence` (or one of
the sequences with predefined offset `Sequence0`, `Sequence1`, and son
on), or be implemented via a filter or transform of an existing
sequence.

The contract of `next()` in `Sequence` requires that calling this
method produces either the next member of the sequence or ```null```
in the case of reaching the end of a finite sequence.  In addition, it
might sometimes throw ``UnsupportedOperationException`` if the
computing the next value is beyond the current implementation or if it
would exceed the values that can be represented by the `Z` class.

There are a number of useful base classes available in `irvine.oeis`
and sub-packages like `irvine.oeis.transform` which are useful for
chaining together existing implementations.  Also in the package are
some useful base classes like `LinearRecurrence`, `FiniteSequence`,
`DecimalExpansionSequence`, etc., that are useful for constructing
common types of sequence or for making simple modifications to
existing sequences.

There is also `CachedSequence` for situations where remembering
previously generated terms of a sequence is important (e.g. for fast
computation).

Another interface, `DirectSequence` provides function definitions for
directly returning `a(n)`. In general, the presence of such an
interface on a sequence means that this computation is more efficient
than simply calling `next()` the requisite number of terms.  However,
sometimes it is desirable to convert any sequence to this form. This
can be achieved with:


```
DirectSequence directSeq = DirectSequence.create(seq)
```

In general there should be no other classes (non-sequence implementations)
in the `axxx` subdirectories.  Other new support code, can be added into
appropriate locations in `irvine/math`, etc.

## Tests

The JUnit 3 testing framework is used.  Most of the utility classes have a
corresponding test class with all the tests linked together via `AllTests.java`
in the various packages.

There used to be a unit test class for every sequence file as well, but the
vast majority of these were essentially empty and we removed.

Testing of the individual sequences can be done by `AbstractSequenceTest`,
and when tests are invoked from the top-level, this class is used to run
a test on each sequence in turn.

## Style Guidelines

The style of the code files including spelling is checked on a daily basis
using a continuous integration system.  The style rules generally follow
the Sun Java style guide, with the following specifics:

* Indentation is 2 spaces (no tabs).

* The class comment should start with the sequence number and contain
  appropriate `@author` tag(s).  These comments are processed by the
  JavaDoc system, so must be valid for that purpose.  For example, `<`
  must be escaped as `&amp;lt;`, etc.  Appropriate `<code>` tags and similar
  should be used where appropriate.

* Member variables match the pattern `m[A-Z][A-Za-z0-9]*`

* Class variables match the pattern `[A-Z][A-Z0-9_]*`

* Local variables match the pattern `[a-z][A-Za-z]*`

* Abstract classes have names starting with `Abstract`.

* Methods should be private unless needed for implementation of
  multiple sequences.

* The `final` keyword should be used wherever it is allowed.

* When splitting an expression across lines, the operator is carried to
  the next line. No particular line length is enforced.

## Implementation Hints

The best option is probably to find a similar already implemented sequence
as a starting point.  Simply copy the class, update the documentation
and change the implementation.  Make sure the right package is being used;
that is, make sure the implementation of `Axxxyyy.java` is in the `axxx`
package.

The field name `mN` is generally used to reflect the index of the term
to generate (although there are exceptions).  `mN` can be `int`, `long`,
or `Z` depending on whichever is easiest or most appropriate for a given
sequence.

The `Z` class is essentially a replacement for `BigInteger`, but fits
better into the structure used here.  (In many cases, code can be converted
from one to the other with nothing more than changing the class type.
This might be helpful if you want to use an algorithm from the jOEIS in
isolation.)

Beyond `Z` there is `Q` for the rationals and `CR` for constructible reals,
then `Polynomial<T>` and `Matrix<T>` for polynomials and matrices over
type `T`.  A certain amount of computation is supported directly on each
type, but in parallel there are classes corresponding to groups, rings, and
fields of these types.  These constructions sometimes provide a greater
variety of operations, especially for polynomials and matrices.

The integers are not a field, but there is a class `IntegerField`
which allows you to operate as if they are.  It will do truncating
division.  This is helpful in a variety of circumstance, for example,
if you're wanting to work over polynomials:

```
private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
```

Actually the above variable would be better called `FIELD` rather than `RING`, but
the above is way more common idiom in the current code.

For sequences requiring stepping over primes, the `Fast` class
provides a sieve-backed sequence of primes.  For factorization use the
`Jaguar` class which uses a variety of strategies and will consult
`factordb.com` in harder cases.

Some sequences support verbose output.  The recommended mechanism is using the
property `oeis.verbose` which can be accessed as

```
private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
```

Often sequences are based on triangles or other functions with
multiple arguments.  Sometimes it is desirable to cache results of
such functions (equivalent to Maple `remember`).  There are various
classes like `MemoryFunction2` that can assist with this.

A number of other idioms are used in the implementation of `next()`
for a given sequence.  A common task might be to search for the next
value satisfying some property. There are a number of approaches to
this like using `FilterPositionSequence` to select terms from an
existing sequence. However, when implemented directly in `next()` we
tend to use a pattern like this:

```
Z next() {
  while (true) {
    if (is(++mN)) {
      return Z.valueOf(mN);
    }
  }
}
```

where depending on the complexity of the `is` test, it might be
directly inlined into the `next()` function.

