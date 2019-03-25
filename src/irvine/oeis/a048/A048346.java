package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048346.
 * @author Sean A. Irvine
 */
public class A048346 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mN; ++k) {
      sb.append('1');
    }
    final Z min = new Z(sb);
    Z n = min.sqrt();
    Z s = n.square();
    while (true) {
      final String v = s.toString();
      int c = 0;
      for (int k = 0; k < v.length(); ++k) {
        if (v.charAt(k) == '1') {
          ++c;
        }
      }
      if (c == mN) {
        return n;
      }
      n = n.add(1);
      s = s.add(n.multiply2().subtract(Z.ONE));
    }
  }
}

