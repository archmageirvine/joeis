package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031245 Length of n-th run of digit 3 in A031235.
 * @author Sean A. Irvine
 */
public class A031245 extends A031235 {

  /** Construct the sequence. */
  public A031245() {
    super(1);
  }

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

