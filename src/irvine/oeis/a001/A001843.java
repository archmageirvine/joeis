package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001843 The coding-theoretic function A(n, 4, 4).
 * @author Sean A. Irvine
 */
public class A001843 extends AbstractSequence {

  /* Construct the sequence. */
  public A001843() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.valueOf((mN - 1) * ((mN - 2) / 2) / 3);
    return mN % 6 == 0 ? t.subtract(1).multiply(mN).divide(4) : t.multiply(mN).divide(4);
  }
}
