package irvine.oeis.a056;
// Generated by gen_seq4.pl A060164/summu1 at 2022-03-25 14:15

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056274 Number of primitive (aperiodic) word structures of length n using a 3-ary alphabet.
 * @author Georg Fischer
 */
public class A056274 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.THREE.pow(mN / d - 1).add(1).divide2().multiply(Functions.MOBIUS.i(d)));
  }
}
