package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064770 Replace each digit of n with the floor of its square root.
 * @author Sean A. Irvine
 */
public class A064770 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long m = ++mN;
    do {
      sb.append(LongUtils.sqrt(m % 10));
      m /= 10;
    } while (m != 0);
    return new Z(sb.reverse());
  }
}
