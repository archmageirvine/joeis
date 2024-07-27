package irvine.oeis.a295;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003961;

/**
 * A295891 a(n) = 1 if binary weights of n and A003961(n) are of the different parity, 0 otherwise; a(n) = A010060(n) XOR A010060(A003961(n)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A295891 extends Sequence1 implements DirectSequence {

  private final DirectSequence mA003961 = new A003961();
  private int mN = 0;

  @Override
  public Z a(final Z n) {
    return Functions.THUE_MORSE.z(n).xor(Functions.THUE_MORSE.z(mA003961.a(n)));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
