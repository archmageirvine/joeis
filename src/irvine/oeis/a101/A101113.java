package irvine.oeis.a101;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000688;
import irvine.oeis.a034.A034444;

/**
 * A101113 Let t(G) = number of unitary factors of the Abelian group G. Then a(n) = Sum t(G) over all Abelian groups G of order exactly n.
 * @author Georg Fischer
 */
public class A101113 extends Sequence1 {

  final Sequence mA000688 = new A000688();
  final Sequence mA034444 = new A034444();
  @Override
  public Z next() {
    return mA034444.next().multiply(mA000688.next());
  }

}
