package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031246 Length of n-th run of digit 4 in <code>A031235</code>.
 * @author Sean A. Irvine
 */
public class A031246 extends A031235 {

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

