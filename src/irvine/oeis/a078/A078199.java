package irvine.oeis.a078;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A078199 Smallest multiple of n (for n &gt;= 100) in which frequency of each occurring digit is the same.
 * @author Sean A. Irvine
 */
public class A078199 extends AbstractSequence {

  private int mN = 99;

  /** Construct the sequence. */
  public A078199() {
    super(100);
  }

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      m += mN;
      if (IntegerUtils.isNonzeroConstant(ZUtils.digitCounts(m)) > 0) {
        return Z.valueOf(m);
      }
    }
  }
}

