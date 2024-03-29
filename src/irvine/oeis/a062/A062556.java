package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A062556 Cubes that are the concatenation of three numbers, one of which is the sum of the other two.
 * @author Sean A. Irvine
 */
public class A062556 extends A000578 {

  /** Construct the sequence. */
  public A062556() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z sq = super.next();
      final String s = sq.toString();
      for (int k = 1; k < s.length() - 1; ++k) {
        final Z a = new Z(s.substring(0, k));
        if (s.charAt(k) != '0') {
          for (int j = k + 1; j < s.length(); ++j) {
            if (s.charAt(j) != '0') {
              final Z b = new Z(s.substring(k, j));
              final Z c = new Z(s.substring(j));
              if (a.equals(b.add(c)) || b.equals(a.add(c)) || c.equals(a.add(b))) {
                return sq;
              }
            }
          }
        }
      }
    }
  }
}
