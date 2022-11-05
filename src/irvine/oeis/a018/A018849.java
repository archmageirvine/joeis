package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A018849 Strobogrammatic squares: the same upside down (calculator-style numerals).
 * @author Sean A. Irvine
 */
public class A018849 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      final StringBuilder sb = new StringBuilder();
      for (int k = s.length() - 1; k >= 0; --k) {
        sb.append(A018846.INVERT[s.charAt(k) - '0']);
      }
      if (sb.toString().equals(s)) {
        return p;
      }
    }
  }
}

