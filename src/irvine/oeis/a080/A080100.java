package irvine.oeis.a080;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A080100 a(n) = 2^(number of 0's in binary representation of n).
 * @author Georg Fischer
 */
public class A080100 extends Sequence0 {

  final Sequence mA080791 = new A080791();
  @Override
  public Z next() {
    return Z.TWO.pow(mA080791.next());
  }

}
