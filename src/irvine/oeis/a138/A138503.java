package irvine.oeis.a138;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008457;

/**
 * A138503 a(n) = Sum_{d|n} (-1)^(d-1)*d^3.
 * @author Georg Fischer
 */
public class A138503 implements Sequence {

  final Sequence mA008457 = new A008457();
  protected long mN;
  /** Construct the sequence. */
  public A138503() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.ZERO.subtract(((mN & 1L) == 0 ? Z.ONE : Z.NEG_ONE).multiply(mA008457.next()));
  }

}
