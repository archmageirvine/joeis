package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030580 Length of n-th run of digit 5 in A030567.
 * @author Sean A. Irvine
 */
public class A030580 extends A030567 {

  /** Construct the sequence. */
  public A030580() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.FIVE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.FIVE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

