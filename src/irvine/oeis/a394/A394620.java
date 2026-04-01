package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000110;
import irvine.oeis.a000.A000798;

/**
 * A394620 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A394620 extends Sequence0 {

  private final Sequence mA = new A000798();
  private final Sequence mB = new A000110();
  private long mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN++ * mN).subtract(Z.ONE.shiftLeft(mN * (mN - 1) / 2)).subtract(mA.next()).add(mB.next());
  }
}

