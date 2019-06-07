package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004151 Omit trailing zeros from <code>n</code>.
 * @author Sean A. Irvine
 */
public class A004151 implements Sequence {

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
