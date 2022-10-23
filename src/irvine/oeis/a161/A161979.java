package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A161979 a(1)=1. a(n) = the smallest integer &gt; a(n-1) containing {the string made by reversing the order of the binary digits of n, and removing leading 0's} as a substring when a(n) is written in binary.
 * @author Sean A. Irvine
 */
public class A161979 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final String t = new StringBuilder(Long.toBinaryString(mN)).reverse().toString();
    final int g = t.indexOf('1');
    final String target = t.substring(g);
    Z s = mA;
    while (true) {
      s = s.add(1);
      if (s.toString(2).contains(target)) {
        mA = s;
        return s;
      }
    }
  }
}

