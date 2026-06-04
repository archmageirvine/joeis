package irvine.oeis.a085;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005875;

/**
 * A085120 a(n) = Sum_{m=1..24} (25-m)^n*A005875(m).
 * @author Sean A. Irvine
 */
public class A085120 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A005875());
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, 24, k -> Z.valueOf(25 - k).pow(mN).multiply(mA.a(k)));
  }
}
