package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030348 Length of n-th run of digit 2 in A030341.
 * @author Sean A. Irvine
 */
public class A030348 extends A030341 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.TWO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

