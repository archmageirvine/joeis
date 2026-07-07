package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395596 allocated for Kyle David Krueger.
 * @author Sean A. Irvine
 */
public class A395596 extends Sequence1 {

  private static final CR C = CR.PHI.subtract(1);
  private long mN = 0;

  @Override
  public Z next() {
    final CR t = C.multiply(++mN);
    final Z r = t.round();
    if (Functions.GCD.z(r, mN).isOne()) {
      return r;
    }
    final CR v = CR.valueOf(r);
    final int dir = v.compareTo(t) < 0 ? 1 : -1;
    long k = 0;
    while (true) {
      k += dir;
      final Z r1 = r.add(k);
      if (Functions.GCD.z(r1, mN).isOne()) {
        return r1;
      }
      final Z rm1 = r.subtract(k);
      if (Functions.GCD.z(rm1, mN).isOne()) {
        return rm1;
      }
    }
  }
}
