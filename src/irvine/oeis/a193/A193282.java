package irvine.oeis.a193;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a081.A081125;

/**
 * A193282 a(n) = (n!/floor(n/2)!)^2.
 * @author Georg Fischer
 */
public class A193282 extends Sequence0 {

  final Sequence mA081125 = new A081125();
  @Override
  public Z next() {
    return mA081125.next().square();
  }

}
