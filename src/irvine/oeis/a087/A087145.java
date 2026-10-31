package irvine.oeis.a087;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a133.A133181;

/**
 * A005349 Niven (or Harshad, or harshad) numbers: numbers that are divisible by the sum of their digits.
 * @author Sean A. Irvine
 */
public class A087145 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A133181());
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> d == mN ? Z.ZERO : mA.a(d));
  }
}
