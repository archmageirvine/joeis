package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030368 Length of n-th run of digit 0 in A030363.
 * @author Sean A. Irvine
 */
public class A030368 extends A030363 {

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

