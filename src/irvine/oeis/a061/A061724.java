package irvine.oeis.a061;

import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061724 Smallest number which has more different digits than its n-th power, or <code>-1</code> if no such number exists.
 * @author Sean A. Irvine
 */
public class A061724 implements Sequence {

  private int mN = 1;

  private int distinctDigits(final String n) {
    int c = 0;
    for (int k = 0; k < n.length(); ++k) {
      c |= 1 << (n.charAt(k) - '0');
    }
    return PopCount.popcount(c);
  }

  @Override
  public Z next() {
    ++mN;
    long b = 9;
    while (true) {
      final int ddb = distinctDigits(String.valueOf(++b));
      if (ddb > 1 && distinctDigits(Z.valueOf(b).pow(mN).toString()) < ddb) {
        return Z.valueOf(b);
      }
    }
  }
}
