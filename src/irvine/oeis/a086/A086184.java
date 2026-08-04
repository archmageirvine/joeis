package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A086184 In decimal expansion of Pi: smallest position &lt;= n where the greatest number begins which is also contained between positions n and 2*n.
 * @author Sean A. Irvine
 */
public class A086184 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(mPi.next());
    if (mS.length() > 1) {
      mS.append(mPi.next());
    }
    final String a = mS.substring(0, mS.length() / 2 + 1);
    final String b = mS.substring(mS.length() / 2);
    Z best = Z.NEG_ONE;
    long pos = 0;
    for (int k = a.length(); k > 0; --k) {
      for (int j = 0; j + k <= a.length(); ++j) {
        if (k == 1 || a.charAt(j) != '0') {
          final String query = a.substring(j, j + k);
          if (b.contains(query)) {
            final Z t = new Z(query);
            if (t.compareTo(best) > 0) {
              best = t;
              pos = j;
            }
          }
        }
      }
      if (best.signum() >= 0) {
        return Z.valueOf(pos + 1);
      }
    }
    throw new RuntimeException();
  }
}
