package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018846.
 * @author Sean A. Irvine
 */
public class A018846 implements Sequence {

  static final char[] INVERT = {'0', '1', '2', '.', '.', '5', '9', '.', '8', '6'};
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString();
      final StringBuilder sb = new StringBuilder();
      for (int k = s.length() - 1; k >= 0; --k) {
        sb.append(INVERT[s.charAt(k) - '0']);
      }
      if (sb.toString().equals(s)) {
        return mN;
      }
    }
  }
}

