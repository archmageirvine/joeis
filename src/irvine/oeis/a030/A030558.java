package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030558 Length of n-th run of digit 2 in <code>A030548</code>.
 * @author Sean A. Irvine
 */
public class A030558 extends A030548 {

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

