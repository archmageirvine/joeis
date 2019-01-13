package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007949.
 * @author Sean A. Irvine
 */
public class A007949 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 0;
    while (m % 3 == 0) {
      m /= 3;
      ++c;
    }
    return Z.valueOf(c);
  }
}
