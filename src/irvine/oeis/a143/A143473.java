package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A143473 Replace the leading digit d of n with 10-d (in decimal representation).
 * @author Georg Fischer
 */
public class A143473 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.TEN;
    }
    final String nstr = String.valueOf(mN);
    return new Z(10 - (nstr.charAt(0) - '0') + nstr.substring(1));
  }
}
