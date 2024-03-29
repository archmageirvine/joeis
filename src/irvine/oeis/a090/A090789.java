package irvine.oeis.a090;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a092.A092230;

/**
 * A090789 Even numbers n such that 37^2 (the square of the first irregular prime) divides the numerator of Bernoulli(n).
 * @author Georg Fischer
 */
public class A090789 extends AbstractSequence {

  private final AbstractSequence mSeq = new A092230();

  /** Construct the sequence. */
  public A090789() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().multiply2();
  }
}
