package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A163808 Write n in binary. Place a 0 right of every 1 without a 0 right of it. a(n) = the decimal value of the result.
 * @author Sean A. Irvine
 */
public class A163808 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    String b = Long.toBinaryString(++mN);
    int p = 0;
    while ((p = b.indexOf("11", p) + 1) != 0) {
      b = b.substring(0, p) + "0" + b.substring(p);
    }
    if (b.endsWith("1")) {
      b = b + "0";
    }
    return new Z(b, 2);
  }
}

