package irvine.oeis.a265;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A265950 Expansion of Product_{k&gt;=1} (1 + k!*x^k).
 * @author Georg Fischer
 */
public class A265950 extends GeneralizedEulerTransform {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /** Construct the sequence. */
  public A265950() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return FACTORIAL.factorial((int) k).negate();
  }
}
