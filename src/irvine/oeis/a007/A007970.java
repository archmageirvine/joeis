package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007970 Rhombic numbers.
 * @author Sean A. Irvine
 */
public class A007970 extends A007968 {

  /** Construct the sequence. */
  public A007970() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
