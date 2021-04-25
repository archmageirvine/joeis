package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A183226 Sum of digits of (2^n) in base 5, also sum of digits of (10^n) in base 5.
 * @author Georg Fischer
 */
public class A183226 implements Sequence {

  protected Z mTerm;
  
  /** Construct this sequence */
  public A183226() {
    mTerm = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(ZUtils.digitSum(mTerm, 5));
    mTerm = mTerm.multiply2();
    return result;
  }
}
