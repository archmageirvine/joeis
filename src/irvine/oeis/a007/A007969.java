package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007969 Rectangular numbers.
 * @author Sean A. Irvine
 */
public class A007969 extends A007968 {

  /** Construct the sequence. */
  public A007969() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
