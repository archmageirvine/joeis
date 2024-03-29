package irvine.oeis.a339;
// Generated by gen_seq4.pl simbinom/simjagfa at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A339965 a(n) = sigma(n) / gcd(sigma(n),n+1).
 * @author Georg Fischer
 */
public class A339965 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A339965() {
    super(1);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma().divide(fs.sigma().gcd(Z.valueOf(mN + 1)));
  }
}
