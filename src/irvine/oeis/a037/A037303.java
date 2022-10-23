package irvine.oeis.a037;
// manually, 2020-10-30

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A037303 Numbers whose base-2 and base-5 expansions have the same digit sum.
 * @author Georg Fischer
 */
public class A037303 extends Sequence1 {

  protected int mN;
  protected int mBase1;
  protected int mBase2;

  /** Construct the sequence. */
  public A037303() {
    this(2, 5);
  }
  
  /**
   * Constructor with parameters
   * @param base modulo base
   * @param incr additive term
   */
  protected A037303(final int base1, final int base2) {
    mN = 0;
    mBase1 = base1;
    mBase2 = base2;
  }

  @Override
  public Z next() {
    boolean busy = true;
    while (busy) {
      ++mN;
      busy = ZUtils.digitSum(mN, mBase1) != ZUtils.digitSum(mN, mBase2);
    }
    return Z.valueOf(mN);
  }
}
