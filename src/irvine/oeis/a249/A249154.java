package irvine.oeis.a249;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000120;

/**
 * A249154 (n+1) times the number of 1's in the binary expansion of n.
 * @author Georg Fischer
 */
public class A249154 extends Sequence0 {

  final Sequence mA000120 = new A000120();
  protected long mN;
  /** Construct the sequence. */
  public A249154() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(Z.ONE).multiply(mA000120.next());
  }

}
