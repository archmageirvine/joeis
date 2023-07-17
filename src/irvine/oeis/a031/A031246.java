package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031246 Length of n-th run of digit 4 in A031235.
 * @author Sean A. Irvine
 */
public class A031246 extends A031235 {

  /** Construct the sequence. */
  public A031246() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.FOUR.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

