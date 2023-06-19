package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a242.A242660;

/**
 * A072835 Exponents occurring in expansion of F_9(q^2).
 * Twice (A242660 without 1).
 * @author Georg Fischer
 */
public class A072835 extends Sequence0 {

  private final PrependSequence mSeq = new PrependSequence(new A242660().skip(2), 0);

  @Override
  public Z next() {
    return mSeq.next().multiply2();
  }
}
