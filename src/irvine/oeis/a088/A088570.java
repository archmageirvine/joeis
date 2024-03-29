package irvine.oeis.a088;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000002;

/**
 * A088570 Sum of terms in n-th block of Kolakoski sequence.
 * @author Georg Fischer
 */
public class A088570 extends Sequence1 {

  final Sequence mA000002 = new A000002();
  protected long mN;
  /** Construct the sequence. */
  public A088570() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.THREE.add(Z.NEG_ONE.pow(mN)).divide(Z.TWO).multiply(mA000002.next());
  }

}
