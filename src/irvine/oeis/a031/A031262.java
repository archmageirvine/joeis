package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031262 Length of n-th run of digit 2 in <code>A031253</code>.
 * @author Sean A. Irvine
 */
public class A031262 extends A031253 {

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

