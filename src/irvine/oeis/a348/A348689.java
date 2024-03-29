package irvine.oeis.a348;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A348689 a(n) = sigma(n) + sigma(n+1) - sigma(n+2), where sigma is the sum of divisors.
 * @author Georg Fischer
 */
public class A348689 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A348689() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Jaguar.factor(mN).sigma().add(Jaguar.factor(mN + 1).sigma()).subtract(Jaguar.factor(mN + 2).sigma());
  }
}
