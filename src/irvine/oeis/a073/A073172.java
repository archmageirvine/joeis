package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073172 The value of index for composite numbers with square subscripts which are also square numbers.
 * @author Sean A. Irvine
 */
public class A073172 extends A002808 {

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
      if (super.next().isSquare()) {
        return Z.valueOf(f);
      }
    }
  }
}
