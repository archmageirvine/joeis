package irvine.oeis.a062;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a030.A030433;
import irvine.oeis.a045.A045715;

/**
 * A062335 Primes starting and ending with 9.
 * @author Sean A. Irvine
 */
public class A062335 extends IntersectionSequence {

  /** Construct the sequence. */
  public A062335() {
    super(1, new A045715(), new A030433());
  }
}
