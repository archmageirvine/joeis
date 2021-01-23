package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030578 Length of n-th run of digit 3 in A030567.
 * @author Sean A. Irvine
 */
public class A030578 extends A030567 {

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

