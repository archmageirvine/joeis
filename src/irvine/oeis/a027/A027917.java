package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a001.A001303;

/**
 * A027917 <code>a(n) =</code> least k such that <code>1+2+...+k &gt;= E{1,2,...,n}</code>, where E is the 3rd elementary symmetric function.
 * @author Sean A. Irvine
 */
public class A027917 extends A001303 {

  private final Sequence mA = new A000217();
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
