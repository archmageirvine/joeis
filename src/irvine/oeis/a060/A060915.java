package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060915 Similar to A060399, but more than one digit may be taken (in order) from each prime.
 * @author Sean A. Irvine
 */
public class A060915 extends A000040 {

  private char mN = '1';

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      int pos = s.indexOf(mN);
      if (pos >= 0) {
        while (pos >= 0) {
          mN = mN == '9' ? '0' : (char) (mN + 1);
          pos = s.indexOf(mN, pos + 1);
        }
        return p;
      }
    }
  }
}

