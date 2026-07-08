package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A085733 Right-truncatable semiprimes.
 * @author Sean A. Irvine
 */
public class A085733 extends FilterSequence {

  /** Construct the sequence. */
  public A085733() {
    super(1, new A001358(), k -> {
      k = k.divide(10); // k itself is already a semiprime
      while (!k.isZero()) {
        if (!Predicates.SEMIPRIME.is(k)) {
          return false;
        }
        k = k.divide(10);
      }
      return true;
    });
  }
}
