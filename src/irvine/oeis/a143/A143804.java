package irvine.oeis.a143;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001614;

/**
 * A143804 Triangle read by rows, thrice the Connell numbers (A001614) - 2.
 * @author Georg Fischer
 */
public class A143804 extends Sequence1 {

  final Sequence mA001614 = new A001614();
  @Override
  public Z next() {
    return Z.THREE.multiply(mA001614.next()).subtract(Z.TWO);
  }

}
