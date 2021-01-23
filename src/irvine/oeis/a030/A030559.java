package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030559 Length of n-th run of digit 3 in A030548.
 * @author Sean A. Irvine
 */
public class A030559 extends A030548 {

  @Override
  public Z next() {
    while (!Z.THREE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.THREE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

