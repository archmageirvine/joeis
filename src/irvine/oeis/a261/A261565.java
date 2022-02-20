package irvine.oeis.a261;

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A261565 Expansion of Product_{k&gt;=1} (1/(1 - 3*x^k))^k.
 * @author Georg Fischer
 */
public class A261565 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A261565() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.valueOf(k)};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.THREE;
  }

}
