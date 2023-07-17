package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022301 Index of n-th 1 in A022300.
 * @author Sean A. Irvine
 */
public class A022301 extends A022300 {

  /** Construct the sequence. */
  public A022301() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
