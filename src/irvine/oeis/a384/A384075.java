package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a193.A193678;

/**
 * A384075 a(n) = neg(M(n)), where M(n) is the n X n circulant matrix with (row 1) = (1,3,5,7, ..., 2n - 1), and neg(M(n)) is the negative part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A384075 extends Sequence1 {

  private final Sequence mA = new A193678();
  private final Sequence mB = new A384074();
  private long mS = -1;

  @Override
  public Z next() {
    mS = -mS;
    return mA.next().multiply(mS).subtract(mB.next()).divide2();
  }
}
