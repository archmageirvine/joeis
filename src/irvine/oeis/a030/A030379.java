package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030379 Length of n-th run of digit 0 in A030373.
 * @author Sean A. Irvine
 */
public class A030379 extends A030373 {

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

