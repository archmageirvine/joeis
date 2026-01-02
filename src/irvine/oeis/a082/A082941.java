package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082941 a(n) is the odd-length palindrome whose digits up to the center are those of n and whose center digit is equal to the digital root of the product of the factorial of n and the reverse of n.
 * @author Sean A. Irvine
 */
public class A082941 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    sb.append(++mN);
    sb.append(mN < 3 ? (mN == 1 ? '1' : '4') : '9');
    sb.append(new StringBuilder().append(mN).reverse());
    return new Z(sb);
  }
}
