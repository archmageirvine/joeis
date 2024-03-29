package irvine.oeis.a127;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005493;

/**
 * A127741 a(n) = (n+1) * A005493(n).
 * @author Georg Fischer
 */
public class A127741 extends Sequence0 {

  final Sequence mA005493 = new A005493();
  protected long mN;
  /** Construct the sequence. */
  public A127741() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(Z.ONE).multiply(mA005493.next());
  }

}
