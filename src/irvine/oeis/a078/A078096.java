package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078096 Least m such that P + m is a prime, where P is the n-th perfect number.
 * @author Sean A. Irvine
 */
public class A078096 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078096() {
    super(1, new A000396(), k -> Functions.NEXT_PRIME.z(k).subtract(k));
  }
}

