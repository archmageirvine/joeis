package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006068.
 * @author Sean A. Irvine
 */
public class A006068 implements Sequence {

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

