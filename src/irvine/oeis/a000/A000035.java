package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000035 Period 2: repeat [0, 1]; a(n) = n mod 2; parity of n.
 * @author Sean A. Irvine
 */
public class A000035 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.PARITY.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.PARITY.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.PARITY.z(n);
  }

}

