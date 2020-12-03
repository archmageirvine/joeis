package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a003.A003137;

/**
 * A030336 Length of n-th run of digit 0 in A003137.
 * @author Sean A. Irvine
 */
public class A030336 extends A003137 {

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

