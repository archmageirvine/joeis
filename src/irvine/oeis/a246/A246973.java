package irvine.oeis.a246;
// Generated by gen_seq4.pl build/simple0 at 2022-09-05 21:58

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A246973 n^2 concatenated with (n+1)^2.
 * @author Georg Fischer
 */
public class A246973 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return new Z(n.square().toString() + n.add(1).square().toString());
  }
}
