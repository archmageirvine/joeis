package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067107 Smallest number whose sum of digits is n!.
 * a(n) = concatenation of (n! mod 9 ) and ( n! div 9 ) nines.
 * @author Georg Fischer
 */
public class A067107 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(Z.valueOf(mN));
    return new Z(String.valueOf(mF.mod(9)) + (mN > 3 ? Z.TEN.pow(mF.divide(9).intValue()).subtract(1).toString() : ""));
  }
}
