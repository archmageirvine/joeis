package irvine.oeis.a065;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003586;

/**
 * A065119 Numbers k such that the k-th cyclotomic polynomial is a trinomial.
 * @author Georg Fischer
 */
public class A065119 extends Sequence1 {

  final Sequence mA003586 = new A003586();
  @Override
  public Z next() {
    return Z.THREE.multiply(mA003586.next());
  }

}
