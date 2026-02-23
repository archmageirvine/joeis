package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393301 a(1) = 0; for n &gt; 1, a(n) is the smallest unused number k such that k! contains the concatenation of a(1), a(2), ..., a(n-1) as a substring.
 * @author Sean A. Irvine
 */
public class A393301 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.length() == 0) {
      mA.append(0);
      return Z.ZERO;
    }
    while (true) {
      mF = mF.multiply(++mN);
      final String s = mF.toString();
      if (s.contains(mA)) {
        mA.append(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
