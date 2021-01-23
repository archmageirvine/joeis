package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030407 Length of n-th run of digit 0 in A030401.
 * @author Sean A. Irvine
 */
public class A030407 extends A030401 {

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

