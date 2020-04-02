package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030422 Length of n-th run of digit 3 in <code>A030413</code>.
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

