package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004151 Omit trailing zeros from n.
 * @author Sean A. Irvine
 */
public class A004151 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (m % 10 == 0) {
      m /= 10;
    }
    return Z.valueOf(m);
  }
}
