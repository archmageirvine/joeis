package irvine.oeis.a181;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A181183 a(n) = sigma(tau(n)) (mod 2).
 * @author Georg Fischer
 */
public class A181183 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A181183() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Jaguar.factor(Jaguar.factor(mN).tau().longValue()).sigma().mod(Z.TWO);
  }
}
