package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077730 a(n) = A077729(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A077730 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077730() {
    super(new A077729(), Z::sqrt);
  }
}
