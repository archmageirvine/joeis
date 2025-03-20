package irvine.oeis.a139;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A139399 Number of steps to reach a cycle in Collatz problem.
 * @author Sean A. Irvine
 */
public class A139399 extends Sequence1 {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z t = mN;
    while (t.compareTo(Z.FOUR) > 0 || Z.THREE.equals(t)) {
      t = Functions.COLLATZ.z(t);
      ++c;
    }
    return Z.valueOf(c);
  }
}
