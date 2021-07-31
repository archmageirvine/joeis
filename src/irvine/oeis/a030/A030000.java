package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030000 a(n) is the smallest nonnegative number k such that the decimal expansion of 2^k contains the string n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A030000 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final String s = mN.toString();
    Z t = Z.ONE;
    long k = 0;
    while (!t.toString().contains(s)) {
      t = t.multiply2();
      ++k;
    }
    return Z.valueOf(k);
  }
}
