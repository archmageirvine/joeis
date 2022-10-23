package irvine.oeis.a218;
// manually at 2021-11-26

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001223;

/**
 * A218075 a(n) = 2^(prime(n+1) - prime(n)).
 * @author Georg Fischer
 */
public class A218075 extends Sequence1 {

  final Sequence mA001223 = new A001223();

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mA001223.next().intValue());
  }

}
