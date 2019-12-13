package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000915;
import irvine.oeis.a001.A001303;

/**
 * A027921 <code>a(n) =</code> least k such that 3rd elementary symmetric function of <code>{1,2,...,k} &gt;= 4th</code> elementary symmetric function of <code>{1,2,...,n}</code>.
 * @author Sean A. Irvine
 */
public class A027921 extends A000915 {

  private final Sequence mA = new A001303();
  private long mK = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    while (mA.next().compareTo(t) < 0) {
      ++mK;
    }
    return Z.valueOf(++mK);
  }
}
