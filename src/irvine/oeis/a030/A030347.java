package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030347 Length of n-th run of digit 1 in A030341.
 * @author Sean A. Irvine
 */
public class A030347 extends A030341 {

  /** Construct the sequence. */
  public A030347() {
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

