package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078097 Least m such that P - m is prime, where P is the n-th perfect number.
 * @author Sean A. Irvine
 */
public class A078097 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078097() {
    super(1, new A000396(), k -> k.subtract(Functions.PREV_PRIME.z(k)));
  }
}

