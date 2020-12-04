package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036977 Primes arising in A036976.
 * @author Sean A. Irvine
 */
public class A036977 implements Sequence {

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
      final Z m  = new Z(sb);
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}

