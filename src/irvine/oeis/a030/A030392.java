package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030392 Length of n-th run of digit 0 in A030386.
 * @author Sean A. Irvine
 */
public class A030392 extends A030386 {

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

