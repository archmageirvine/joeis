package irvine.oeis.a030;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a000.A000040;

/**
 * A030009 Euler transform of primes.
 * @author Sean A. Irvine
 */
public class A030009 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A030009() {
    super(new A000040(), 0);
  }
}
