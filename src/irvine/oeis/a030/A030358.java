package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030358 Length of n-th run of digit 0 in A030353.
 * @author Sean A. Irvine
 */
public class A030358 extends A030353 {

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

