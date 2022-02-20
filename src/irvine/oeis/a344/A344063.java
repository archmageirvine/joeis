package irvine.oeis.a344;

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A344063 Expansion of Product_{k&gt;=1} (1 + 4^(k-1)*x^k).
 * @author Georg Fischer
 */
public class A344063 extends GeneralizedEulerTransform {

  protected Z mBase;

  /** Construct the sequence. */
  public A344063() {
    this(4);
  }

  /**
   * Generic constructor with parameter
   * @param base for power of <code>k-1</code>
   */
  public A344063(final int base) {
    super(0, 1);
    mBase = Z.valueOf(base);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return mBase.pow(k - 1).negate();
  }
}
