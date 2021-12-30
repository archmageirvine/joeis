package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A164895 Decimal representation of the strings formed by concatenating the digits of Pi in base 2.
 * @author Georg Fischer
 */
public class A164895 extends A000796 {

  protected StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    mSb.append(super.next().toString(2));
    return new Z(mSb.toString(), 2);
  }
}
