package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004283.
 * @author Sean A. Irvine
 */
public class A004283 implements Sequence {

  private Z mN = init();

  protected Z init() {
    return Z.ZERO;
  }

  private boolean is01(final String s) {
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (c != '0' && c != '1') {
        return false;
      }
    }
    return true;
  }

  protected int base() {
    return 3;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final String s = mN.multiply(++k).toString(base());
      if (is01(s)) {
        return new Z(s);
      }
    }
  }
}
