package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A050632 a(n+1) is next smallest nontrivial square containing a(n) as a substring, initial term is 9.
 * @author Sean A. Irvine
 */
public class A050632 extends A000290 {

  {
    setOffset(1);
    super.next(); // skip 0
    super.next(); // skip 1
    super.next(); // skip 4
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
