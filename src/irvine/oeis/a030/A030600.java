package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030600 Length of the n-th run of digit 5 in <code>A030588</code>.
 * @author Sean A. Irvine
 */
public class A030600 extends A030588 {

  @Override
  public Z next() {
    while (!Z.FIVE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.FIVE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

