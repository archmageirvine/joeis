package irvine.oeis.a092;
// manually simbinom at 2023-03-17 15:01

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A092346 a(0)=1; a(n) = sigma_1(n) + sigma_2(n).
 * @author Georg Fischer
 */
public class A092346 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A092346() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Jaguar.factor(mN).sigma(1).add(Jaguar.factor(mN).sigma(2));
  }
}
