package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031243 Length of n-th run of digit 1 in A031235.
 * @author Sean A. Irvine
 */
public class A031243 extends A031235 {

  /** Construct the sequence. */
  public A031243() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.ONE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

