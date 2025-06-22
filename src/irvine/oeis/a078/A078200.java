package irvine.oeis.a078;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A078200 a(n) = A078199(n)/n; i.e., smallest k such that frequency of each occurring digit in k*n is the same.
 * @author Sean A. Irvine
 */
public class A078200 extends AbstractSequence {

  private int mN = 99;

  /** Construct the sequence. */
  public A078200() {
    super(100);
  }

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      m += mN;
      if (IntegerUtils.isNonzeroConstant(ZUtils.digitCounts(m)) > 0) {
        return Z.valueOf(m / mN);
      }
    }
  }
}

