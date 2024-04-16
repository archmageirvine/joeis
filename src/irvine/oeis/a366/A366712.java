package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a178.A178248;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366712 Number of distinct prime divisors of 12^n + 1.
 * @author Sean A. Irvine
 */
public class A366712 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366712() {
    super(0, new A178248(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}

