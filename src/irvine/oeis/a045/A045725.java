package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A045725 Fibonacci numbers having initial digit '1'.
 * @author Sean A. Irvine
 */
public class A045725 extends A000045 {

  {
    setOffset(1);
    super.next();
    super.next(); // skip initial 0, 1
  }

  protected String prefix() {
    return "1";
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (f.toString().startsWith(prefix())) {
        return f;
      }
    }
  }
}
