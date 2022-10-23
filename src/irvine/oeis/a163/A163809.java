package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A163809 Write n in binary. Insert a 0 in the middle of each pair of two consecutive 1's. a(n) = the decimal value of the result.
 * @author Sean A. Irvine
 */
public class A163809 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    String b = Long.toBinaryString(++mN);
    int p = 0;
    while ((p = b.indexOf("11", p) + 1) != 0) {
      b = b.substring(0, p) + "0" + b.substring(p);
    }
    return new Z(b, 2);
  }
}

