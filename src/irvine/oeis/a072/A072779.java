package irvine.oeis.a072;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A072779 a(n) = sigma_2(n) + phi(n) * sigma(n).
 * @author Georg Fischer
 */
public class A072779 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A072779() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Jaguar.factor(mN).sigma(2).add(Functions.PHI.z(mN).multiply(Functions.SIGMA1.z(mN)));
  }
}
