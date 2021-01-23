package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031226 Length of n-th run of digit 0 in A031219.
 * @author Sean A. Irvine
 */
public class A031226 extends A031219 {

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

