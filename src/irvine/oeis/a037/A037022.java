package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002193;

/**
 * A037022 Triangle in which row n has the first n digits of sqrt(n) (truncated).
 * @author Sean A. Irvine
 */
public class A037022 implements Sequence {

  private Sequence mA = null;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      ++mN;
      mA = new A002193() {
        @Override
        protected Z n() {
          return Z.valueOf(mN);
        }
      };
    }
    return mA.next();
  }
}
