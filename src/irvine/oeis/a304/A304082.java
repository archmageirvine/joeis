package irvine.oeis.a304;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006952;

/**
 * A304082 a(n) = 3^n - A006952(n).
 * @author Georg Fischer
 */
public class A304082 extends Sequence0 {

  final Sequence mA006952 = new A006952();
  protected long mN;
  /** Construct the sequence. */
  public A304082() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow(Z.valueOf(mN)).subtract(mA006952.next());
  }

}
