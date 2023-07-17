package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a007.A007949;

/**
 * A014578 Binary expansion of Thue constant (or Roth's constant).
 * @author Sean A. Irvine
 */
public class A014578 extends A007949 {

  /** Construct the sequence. */
  public A014578() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return Z.ONE.subtract(super.next().mod(2));
  }
}
