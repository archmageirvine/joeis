package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030393 Length of n-th run of digit 1 in A030386.
 * @author Sean A. Irvine
 */
public class A030393 extends A030386 {

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.ONE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

