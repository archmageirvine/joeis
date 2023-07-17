package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030577 Length of n-th run of digit 2 in A030567.
 * @author Sean A. Irvine
 */
public class A030577 extends A030567 {

  /** Construct the sequence. */
  public A030577() {
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

