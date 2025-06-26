package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a193.A193678;

/**
 * A384078 a(n) = pos(M(n)), where M(n) is the n X n left circulant matrix with (row 1) = (1,3,5,7, ..., 2n - 1), and pos(M(n)) is the positive part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A384078 extends Sequence1 {

  private final Sequence mA = new A193678();
  private final Sequence mB = new A384074();
  private long mS = 1;
  private int mC = 0;

  @Override
  public Z next() {
    if (++mC == 2) {
      mS = -mS;
      mC = 0;
    }
    return mA.next().multiply(mS).add(mB.next()).divide2();
  }
}
