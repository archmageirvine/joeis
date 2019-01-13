package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163809.
 * @author Sean A. Irvine
 */
public class A163809 implements Sequence {

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

