package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030612 Length of n-th run of digit 0 in A030604.
 * @author Sean A. Irvine
 */
public class A030612 extends A030604 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (!super.next().isZero()) {
      // do nothing
    }
    long cnt = 1;
    while (super.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

