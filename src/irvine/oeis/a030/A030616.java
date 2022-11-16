package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030616 Length of n-th run of digit 4 in A030604.
 * @author Sean A. Irvine
 */
public class A030616 extends A030604 {

  {
    setOffset(1);
  }

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

