package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A081829 Numbers n such that the n-th term of Hofstadter Q-sequence is &gt; (n+1)-th term.
 * @author Sean A. Irvine
 */
public class A081829 extends A005185 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.compareTo(mA) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
