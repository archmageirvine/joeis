package irvine.oeis.a061;
// manually 2021-07-05

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061037 Numerator of 1/4 - 1/n^2. 
 * @author Georg Fischer
 */
public class A061037 implements Sequence {

  protected int mN;
  protected Q mAdd;

  /** Construct the sequence. */
  public A061037() {
    this(2, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parm parameter
   */
  public A061037(final int offset, final int parm) {
    mN = offset - 1;
    mAdd = new Q(Z.ONE, Z.valueOf(parm));
  }

  @Override
  public Z next() {
    ++mN;
    return (mAdd.subtract(new Q(Z.ONE, Z.valueOf(mN).square()))).num();
  }
}
