package irvine.oeis.a055;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a030.A030108;

/**
 * A055958 a(n) = n + reversal of base 9 digits of n (written in base 10).
 * @author Georg Fischer
 */
public class A055958 implements Sequence {

  final Sequence mA030108 = new A030108();
  protected long mN;
  /** Construct the sequence. */
  public A055958() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA030108.next());
  }

}
