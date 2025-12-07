package irvine.oeis.a082;

import java.util.HashSet;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082385 For each n append T(n), T(T(n)), T^3(n), ..., T^r(n), where T(n) = A055012(n) and r is the smallest integer such that T^r(n) is one of the following numbers: 1, 55, 136, 153, 160, 370, 371, 407, 919.
 * @author Sean A. Irvine
 */
public class A082385 extends Sequence1 {

  private static final HashSet<Z> TERMINALS = new HashSet<>(List.of(Z.ONE, Z.valueOf(55), Z.valueOf(136), Z.valueOf(153), Z.valueOf(160), Z.valueOf(370), Z.valueOf(371), Z.valueOf(407), Z.valueOf(919)));
  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (TERMINALS.contains(mA)) {
      mA = Z.valueOf(++mN);
    }
    mA = Functions.DIGIT_SUM_CUBES.z(mA);
    return mA;
  }
}
