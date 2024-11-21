package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073173 Square composite numbers with square subscripts.
 * @author Sean A. Irvine
 */
public class A073173 extends A002808 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      final long f = ++mN * mN;
      while (mM + 1 < f) {
        ++mM;
        super.next();
      }
      ++mM;
      final Z t = super.next();
      if (t.isSquare()) {
        return t;
      }
    }
  }
}
