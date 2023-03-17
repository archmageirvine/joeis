package irvine.oeis.a092;
// manually simbinom at 2023-03-17 15:01

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A092347 a(0)=1; a(n) = sigma_1(n) + sigma_2(n) + sigma_3(n).
 * @author Georg Fischer
 */
public class A092347 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A092347() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Jaguar.factor(mN).sigma(1).add(Jaguar.factor(mN).sigma(2)).add(Jaguar.factor(mN).sigma(3));
  }
}
