package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031245 Length of n-th run of digit 3 in <code>A031235</code>.
 * @author Sean A. Irvine
 */
public class A031245 extends A031235 {

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

