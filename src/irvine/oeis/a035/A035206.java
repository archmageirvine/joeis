package irvine.oeis.a035;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a036.A036043;
import irvine.oeis.a048.A048996;

/**
 * A035206 Number of multisets associated with least integer of each prime signature.
 * @author Sean A. Irvine
 */
public class A035206 extends A048996 {

  private final Sequence mA036043 = new SkipSequence(new A036043(), 1);

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN, mA036043.next().longValueExact()));
  }
}

