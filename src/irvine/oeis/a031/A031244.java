package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031244 Length of n-th run of digit 2 in A031235.
 * @author Sean A. Irvine
 */
public class A031244 extends A031235 {

  /** Construct the sequence. */
  public A031244() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.TWO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

