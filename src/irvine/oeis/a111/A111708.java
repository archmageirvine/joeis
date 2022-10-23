package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A111708 a(n) = n concatenated with 9's complement of n.
 * @author Georg Fischer
 */
public class A111708 extends Sequence0 {

  private int mN;

  /** Construct the sequence. */
  public A111708() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    final String nstr = String.valueOf(mN);
    final StringBuilder sb = new StringBuilder(nstr);
    for (int i = 0; i < nstr.length(); ++i) {
      sb.append(Character.forDigit(9 - Character.digit(nstr.charAt(i), 10), 10));
    }
    return new Z(sb.toString());
  }
}
