package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A050634 a(n+1) is next smallest square ending with a(n), initial term is 1.
 * @author Sean A. Irvine
 */
public class A050634 extends A000290 {

  {
    super.next(); // skip 0
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
