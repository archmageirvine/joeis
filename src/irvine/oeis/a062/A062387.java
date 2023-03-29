package irvine.oeis.a062;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A062387 Squares in which removing a suitably chosen digit yields another square and this process can be continued until the digits are exhausted.
 * @author Sean A. Irvine
 */
public class A062387 extends A000290 {

  private final Set<Z> mA = new HashSet<>();
  {
    mA.add(super.next());
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z sq = super.next();
      if (sq.compareTo(Z.TEN) < 0) {
        mA.add(sq);
        return sq;
      }
      final String s = sq.toString();
      for (int k = 0; k < s.length(); ++k) {
        final String t = s.substring(0, k) + s.substring(k + 1);
        if (mA.contains(new Z(t))) {
          mA.add(sq);
          return sq;
        }
      }
    }
  }
}
