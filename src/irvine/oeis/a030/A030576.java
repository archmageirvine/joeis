package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030576 Length of n-th run of digit 1 in A030567.
 * @author Sean A. Irvine
 */
public class A030576 extends A030567 {

  /** Construct the sequence. */
  public A030576() {
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

