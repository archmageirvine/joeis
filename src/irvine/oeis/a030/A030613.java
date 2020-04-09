package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030613 Length of n-th run of digit 1 in <code>A030604</code>.
 * @author Sean A. Irvine
 */
public class A030613 extends A030604 {

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

