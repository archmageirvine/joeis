package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a034.A034472;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366580 Number of distinct prime divisors of 3^n + 1.
 * @author Sean A. Irvine
 */
public class A366580 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366580() {
    super(0, new A034472(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}

