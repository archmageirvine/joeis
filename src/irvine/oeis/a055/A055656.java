package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a048.A048855;

/**
 * A055656 Excess in exponents of powers of 2 in EulerPhi of n! compared to that of n!.
 * @author Sean A. Irvine
 */
public class A055656 extends A048855 {

  private final Sequence mF = new SkipSequence(new A000142(), 1);
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary() - mF.next().makeOdd().auxiliary());
  }
}

