package irvine.oeis.a125;
// manually cofrman/cofr at 2022-02-25 10:11

import irvine.math.z.Z;
import irvine.oeis.a124.A124091;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A125600 Continued fraction expansion of constant defined in A124091.
 * @author Georg Fischer
 */
public class A125600 extends ContinuedFractionSequence {

  private long mN = 0;

  /** Construct the sequence */
  public A125600() {
    super(0, new A124091());
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return super.next().add(1);
    }
    return super.next();
  }
}
