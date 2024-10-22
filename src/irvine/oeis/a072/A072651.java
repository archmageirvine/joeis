package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052409;
import irvine.oeis.a052.A052410;

/**
 * A072651 Table by antidiagonals used in calculating integer solutions to b^c=c^d with b,c,d&gt;0.
 * @author Sean A. Irvine
 */
public class A072651 extends Sequence1 {

  private final DirectSequence mA052409 = DirectSequence.create(new A052409());
  private final DirectSequence mA052410 = DirectSequence.create(new A052410());
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int k) {
    if (n == 1) {
      return Z.ONE;
    }
    final Z a = mA052410.a(n).pow(k);
    final Z b = mA052409.a(n);
    return a.multiply(b).mod(k) == 0 ? Z.valueOf(n).pow(a) : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN + 1 - mM);
  }
}
