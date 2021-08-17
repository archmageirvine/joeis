package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A050644 a(n+1) is next smallest nontrivial cube containing a(n) as a substring, initial term is 27.
 * @author Sean A. Irvine
 */
public class A050644 extends A000578 {

  {
    super.next(); // skip 0
    super.next(); // skip 1
    super.next(); // skip 8
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
