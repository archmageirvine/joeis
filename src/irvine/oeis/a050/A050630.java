package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A050630 a(n+1) is next smallest nontrivial square containing a(n) as a substring, initial term is 4.
 * @author Sean A. Irvine
 */
public class A050630 extends A000290 {

  {
    super.next(); // skip 0
    super.next(); // skip 1
  }
  private String mS = "";

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) != 0) {
        final String s = t.toString();
        if (s.contains(mS)) {
          mS = s;
          return t;
        }
      }
    }
  }
}
