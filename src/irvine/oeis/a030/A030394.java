package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030394 Length of n-th run of digit 2 in A030386.
 * @author Sean A. Irvine
 */
public class A030394 extends A030386 {

  /** Construct the sequence. */
  public A030394() {
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

