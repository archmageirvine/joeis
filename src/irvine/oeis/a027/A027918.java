package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a000.A000915;

/**
 * A027918 Least k such that <code>1+2+...+k &gt;= E{1,2,...,n}</code>, where E is the 4th elementary symmetric function.
 * @author Sean A. Irvine
 */
public class A027918 extends A000915 {

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
