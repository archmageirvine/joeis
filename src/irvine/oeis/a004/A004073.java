package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004073 Start with a(1)=1; to get a(n) replace each i in a(n-1) with 12...i, then append n.
 * @author Sean A. Irvine
 */
public class A004073 implements Sequence {

  private String mA = "";
  private int mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mA.length(); ++k) {
      final int limit = mA.charAt(k) - '0';
      for (int i = 1; i <= limit; ++i) {
        sb.append(i);
      }
    }
    sb.append(++mN);
    mA = sb.toString();
    return new Z(mA);
  }

}
