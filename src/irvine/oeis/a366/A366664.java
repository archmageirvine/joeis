package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a062.A062396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366664 Number of distinct prime divisors of 9^n + 1.
 * @author Sean A. Irvine
 */
public class A366664 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366664() {
    super(0, new A062396(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}

