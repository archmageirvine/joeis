package irvine.oeis.a070;
// manually 2022-02-21

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A070933 Expansion of Product_{k&gt;=1} 1/(1 - 2*t^k).
 * @author Georg Fischer
 */
public class A070933 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A070933() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.TWO;
  }
}
