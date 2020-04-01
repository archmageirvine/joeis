package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030422.
 * @author Sean A. Irvine
 */
public class A030422 extends A030413 {

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

