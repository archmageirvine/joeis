package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031242 Length of n-th run of digit 0 in <code>A031235</code>.
 * @author Sean A. Irvine
 */
public class A031242 extends A031235 {

  @Override
  public Z next() {
    while (!Z.ZERO.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.ZERO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

