package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a001.A001614;

/**
 * A036571 Binary packing of Connell sequence (shifted once right).
 * @author Sean A. Irvine
 */
public class A036571 extends A001614 {

  /** Construct the sequence. */
  public A036571() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : Z.ONE.shiftLeft(super.next().longValueExact() - 1).add(mA);
    return mA;
  }
}
