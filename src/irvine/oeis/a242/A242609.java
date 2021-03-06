package irvine.oeis.a242;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a226.A226225;

/**
 * A242609 Expansion of phi(-q) * phi(q^8) in powers of q where phi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A242609 implements Sequence {

  final Sequence mA226225 = new A226225();
  protected long mN;
  /** Construct the sequence. */
  public A242609() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return ((mN & 1L) == 0 ? Z.ONE : Z.NEG_ONE).multiply(mA226225.next());
  }

}
