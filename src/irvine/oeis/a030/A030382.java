package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030382.
 * @author Sean A. Irvine
 */
public class A030382 extends A030373 {

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

