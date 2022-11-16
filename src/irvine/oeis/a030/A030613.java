package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030613 Length of n-th run of digit 1 in A030604.
 * @author Sean A. Irvine
 */
public class A030613 extends A030604 {

  {
    setOffset(1);
  }

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

