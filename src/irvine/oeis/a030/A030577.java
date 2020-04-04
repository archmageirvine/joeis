package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030577 Length of n-th run of digit 2 in <code>A030567</code>.
 * @author Sean A. Irvine
 */
public class A030577 extends A030567 {

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

