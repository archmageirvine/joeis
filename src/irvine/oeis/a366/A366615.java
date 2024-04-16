package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a034.A034474;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366615 Number of distinct prime divisors of 5^n + 1.
 * @author Sean A. Irvine
 */
public class A366615 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366615() {
    super(0, new A034474(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}

