package irvine.oeis.a006;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a072.A072068;
import irvine.oeis.a072.A072069;
import irvine.oeis.a072.A072070;
import irvine.oeis.a072.A072071;

/**
 * A006991.
 * @author Sean A. Irvine
 */
public class A006991 implements Sequence {

  // Assumes the truth of the Birch and Swinnerton-Dyer conjecture

  private final A072068 mA072068 = new A072068();
  private final A072069 mA072069 = new A072069();
  private final A072070 mA072070 = new A072070();
  private final A072071 mA072071 = new A072071();
  {
    mA072070.next();
    mA072071.next();
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a;
      final Z b;
      if ((mN & 1) == 0) {
        a = mA072070.next();
        b = mA072071.next();
      } else {
        a = mA072068.next();
        b = mA072069.next();
      }
      if (a.equals(b.multiply2()) && LongUtils.isSquareFree(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

