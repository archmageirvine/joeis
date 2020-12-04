package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036976 Becomes a prime if a 1 is inserted before each digit.
 * @author Sean A. Irvine
 */
public class A036976 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final StringBuilder sb = new StringBuilder();
      final String s = String.valueOf(mN);
      for (int k = 0; k < s.length(); ++k) {
        sb.append('1').append(s.charAt(k));
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

