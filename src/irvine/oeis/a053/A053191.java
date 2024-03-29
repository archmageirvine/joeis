package irvine.oeis.a053;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;

/**
 * A053191 a(n) = n^2 * phi(n).
 * @author Georg Fischer
 */
public class A053191 extends Sequence1 {

  final Sequence mA000010 = new A000010();
  protected long mN;
  /** Construct the sequence. */
  public A053191() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).square().multiply(mA000010.next());
  }

}
