package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030557 Length of n-th run of digit 1 in A030548.
 * @author Sean A. Irvine
 */
public class A030557 extends A030548 {

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

