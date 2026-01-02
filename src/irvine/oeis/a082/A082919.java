package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A082919 Numbers k such that k, k+2, k+4, k+6, k+8, k+10, k+12 and k+14 are semiprimes.
 * @author Sean A. Irvine
 */
public class A082919 extends FilterSequence {

  /** Construct the sequence. */
  public A082919() {
    super(1, new A001358(), k -> k.isOdd()
      && Predicates.SEMIPRIME.is(k.add(2))
      && Predicates.SEMIPRIME.is(k.add(4))
      && Predicates.SEMIPRIME.is(k.add(6))
      && Predicates.SEMIPRIME.is(k.add(8))
      && Predicates.SEMIPRIME.is(k.add(10))
      && Predicates.SEMIPRIME.is(k.add(12))
      && Predicates.SEMIPRIME.is(k.add(14))
    );
  }
}
