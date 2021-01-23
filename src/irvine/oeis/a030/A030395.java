package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030395 Length of n-th run of digit 3 in A030386.
 * @author Sean A. Irvine
 */
public class A030395 extends A030386 {

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

