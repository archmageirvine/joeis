package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A061459 Squares which produce squares when the leading digit is moved to the end.
 * @author Sean A. Irvine
 */
public class A061459 extends A000290 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final String s = t.toString();
      final Z r = new Z(s.substring(1) + s.charAt(0));
      if (r.isSquare()) {
        return t;
      }
    }
  }
}

