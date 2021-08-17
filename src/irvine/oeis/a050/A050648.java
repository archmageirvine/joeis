package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A050648 a(n+1) is next smallest cube ending with a(n), initial term is 8.
 * @author Sean A. Irvine
 */
public class A050648 extends A000578 {

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
        if (s.endsWith(mS)) {
          mS = s;
          return t;
        }
      }
    }
  }
}
