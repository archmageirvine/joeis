package irvine.oeis.a236;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000005;

/**
 * A236284 a(n) = tau(n)^n, where tau(n) = A000005(n) = the number of divisors of n.
 * @author Georg Fischer
 */
public class A236284 extends Sequence1 {

  final Sequence mA000005 = new A000005();
  protected long mN;
  /** Construct the sequence. */
  public A236284() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA000005.next().pow(Z.valueOf(mN));
  }

}
