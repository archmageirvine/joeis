package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030598 Length of n-th run of digit 3 in A030588.
 * @author Sean A. Irvine
 */
public class A030598 extends A030588 {

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

