package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030575 Run length of n-th run of digit 0 in A030567.
 * @author Sean A. Irvine
 */
public class A030575 extends A030567 {

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

