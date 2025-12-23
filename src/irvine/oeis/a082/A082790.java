package irvine.oeis.a082;

/**
 * A082790 Number of nonisomorphic configurations of degree &gt;= 2 (or generators) of n triples in Steiner triple systems.
 * @author Sean A. Irvine
 */
public class A082790 extends A082789 {

  @Override
  protected boolean accept(final long[] triples) {
    long seen = 0;
    long seenTwice = 0;
    for (final long x : triples) {
      seenTwice |= seen & x;
      seen |= x;
    }
    return seen == seenTwice;
  }
}
