package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031242 Length of n-th run of digit 0 in A031235.
 * @author Sean A. Irvine
 */
public class A031242 extends A031235 {

  @Override
  public Z next() {
    while (!super.next().isZero()) {
      // do nothing
    }
    long cnt = 1;
    while (super.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

