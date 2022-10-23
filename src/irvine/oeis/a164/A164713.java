package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A164713 A positive integer n is included if all runs of 0's in binary n are of the same length, and if all runs of 1's in binary n are of the same length.
 * @author Sean A. Irvine
 */
public class A164713 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String b = mN.toString(2);
      int lenOnes = -1;
      int lenZeros = -1;
      boolean state = true;
      int cnt = 0;
      for (int k = 0; k < b.length(); ++k) {
        final char c = b.charAt(k);
        if (state) {
          if (c == '1') {
            ++cnt;
          } else {
            if (lenOnes == -1) {
              lenOnes = cnt;
            } else if (lenOnes != cnt) {
              cnt = -1;
              break;
            }
            cnt = 1;
            state = false;
          }
        } else {
          if (c == '0') {
            ++cnt;
          } else {
            if (lenZeros == -1) {
              lenZeros = cnt;
            } else if (lenZeros != cnt) {
              cnt = -1;
              break;
            }
            cnt = 1;
            state = true;
          }
        }
      }
      if (cnt >= 0) {
        if (state) {
          if (lenOnes == cnt || lenOnes == -1) {
            return mN;
          }
        } else if (lenZeros == cnt || lenZeros == -1) {
          return mN;
        }
      }
    }
  }
}

