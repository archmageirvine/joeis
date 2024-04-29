package irvine.oeis.a100;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A100728 Number of rank-(n-2) simple matroids on S_n.
 * @author Sean A. Irvine
 */
public class A100728 extends AbstractSequence {

  /** Construct the sequence. */
  public A100728() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    final int index = ++mN + 1;
    return Functions.BELL.z(index).subtract(Z.valueOf((long) mN * mN + mN + 4).shiftLeft(mN - 2)).add(Z.valueOf(3L * mN * mN - mN + 10).multiply(mN + 1).multiply(mN).divide(24));
  }
}

