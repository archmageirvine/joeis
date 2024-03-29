package irvine.oeis.a092;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A092403 a(n) = sigma(n) + sigma(n+1).
 * @author Georg Fischer
 */
public class A092403 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A092403() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Jaguar.factor(mN).sigma().add(Jaguar.factor(mN + 1).sigma());
  }
}
