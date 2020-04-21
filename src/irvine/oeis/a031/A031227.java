package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031227 Length of n-th run of digit 1 in <code>A031219</code>.
 * @author Sean A. Irvine
 */
public class A031227 extends A031219 {

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

