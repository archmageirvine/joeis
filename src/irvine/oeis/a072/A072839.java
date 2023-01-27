package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a023.A023920;

/**
 * A072839 Expansion of F_9(q^2).
 * A023920 aerated with 0's.
 * @author Georg Fischer
 */
public class A072839 extends Sequence0 {

  private final ZeroSpacedSequence mSeq = new ZeroSpacedSequence(new A023920(), 1);

  @Override
  public Z next() {
    return mSeq.next();
  }
}
