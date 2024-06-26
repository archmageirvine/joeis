package irvine.oeis.a243;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A243129 a(n) = sigma(d(d(d(n)))), where d(n) is the number of divisors of n.
 * @author Georg Fischer
 */
public class A243129 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A243129() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.SIGMA1.z(Functions.SIGMA0.z(Jaguar.factor(Jaguar.factor(mN).tau()).tau()));
  }
}
