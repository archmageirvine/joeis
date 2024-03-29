package irvine.oeis.a104;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a047.A047845;

/**
 * A104275 Numbers k such that 2k-1 is not prime.
 * @author Georg Fischer
 */
public class A104275 extends Sequence1 {

  final Sequence mA047845 = new A047845();
  @Override
  public Z next() {
    return mA047845.next().add(Z.ONE);
  }

}
