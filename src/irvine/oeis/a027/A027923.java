package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000330;
import irvine.oeis.a000.A000914;

/**
 * A027923 <code>a(n) =</code> least k such that <code>E{1,2,...,k} &gt;= 1^2 + 2^2 + ... + n^2</code>, where E <code>= 2nd</code> elementary symmetric function.
 * @author Sean A. Irvine
 */
public class A027923 extends A000330 {

  private final Sequence mA = new A000914();
  private Z mT = Z.NEG_ONE;
  private long mK = -1;

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    while (mT.compareTo(t) < 0) {
      mT = mA.next();
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
