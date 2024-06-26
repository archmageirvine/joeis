package irvine.oeis.a092;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A092348 a(n) = sigma_3(n) - sigma_1(n).
 * @author Georg Fischer
 */
public class A092348 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A092348() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Jaguar.factor(mN).sigma(3).subtract(Functions.SIGMA1.z(mN));
  }
}
