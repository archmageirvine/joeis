package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030410 Length of n-th run of digit 3 in A030401.
 * @author Sean A. Irvine
 */
public class A030410 extends A030401 {

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

