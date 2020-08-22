package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000914;
import irvine.oeis.a001.A001303;

/**
 * A027919 a(n) = least k such that 2nd elementary symmetric function of {1,2,...,k+1} &gt;= 3rd elementary symmetric function of {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A027919 extends A001303 {

  private final Sequence mA = new A000914();
  private long mK = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    while (mA.next().compareTo(t) < 0) {
      ++mK;
    }
    return Z.valueOf(++mK);
  }
}
