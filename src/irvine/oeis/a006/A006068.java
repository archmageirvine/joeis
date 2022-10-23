package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006068 a(n) is Gray-coded into n.
 * @author Sean A. Irvine
 */
public class A006068 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    long r = 0;
    while (t != 0) {
      r ^= t;
      t >>>= 1;
    }
    return Z.valueOf(r);
  }

}

