package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030560 Length of n-th run of digit 4 in <code>A030548</code>.
 * @author Sean A. Irvine
 */
public class A030560 extends A030548 {

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.FOUR.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

