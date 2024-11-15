package irvine.oeis.a080;

import irvine.oeis.a000.A000040;
import irvine.oeis.transform.InverseAronsonTransformSequence;

/**
 * A080759 Inverse Aronson transform of primes.
 * @author Sean A. Irvine
 */
public class A080759 extends InverseAronsonTransformSequence {

  /** Construct the sequence. */
  public A080759() {
    super(1, new A000040());
  }
}

