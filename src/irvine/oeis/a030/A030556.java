package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030556 run length of n-th run of digit 0 in A030548.
 * @author Sean A. Irvine
 */
public class A030556 extends A030548 {

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

