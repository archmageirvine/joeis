package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038502 Remove 3's from n.
 * @author Sean A. Irvine
 */
public class A038502 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (m % 3 == 0) {
      m /= 3;
    }
    return Z.valueOf(m);
  }
}
