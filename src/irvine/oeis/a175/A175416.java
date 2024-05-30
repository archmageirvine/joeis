package irvine.oeis.a175;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A175416 Those positive integers n that when written in binary, each run of 0's and 1's has a length which is coprime to the number of binary digits of n.
 * @author Sean A. Irvine
 */
public class A175416 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String binary = Long.toBinaryString(++mN);
      final int a = binary.length();
      char c = binary.charAt(0);
      int l = 1;
      boolean ok = true;
      for (int k = 1; k < a; ++k) {
        final char d = binary.charAt(k);
        if (d == c) {
          ++l;
        } else {
          if (Functions.GCD.i(a, l) != 1) {
            ok = false;
            break;
          }
          c = d;
          l = 1;
        }
      }
      if (ok && Functions.GCD.i(a, l) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

