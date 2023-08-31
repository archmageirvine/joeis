package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a039.A039724;

/**
 * A065360 Alternating sum of "negabits". Replace (-2)^k with (-1)^k in negabinary expansion of n.
 * @author Sean A. Irvine
 */
public class A065360 extends A039724 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final String t = super.next().toString();
    long s = 0;
    for (int k = 0; k < t.length(); ++k) {
      if (t.charAt(k) != '0') {
        s += 1 - 2 * (k & 1);
      }
    }
    return Z.valueOf(s);
  }
}
