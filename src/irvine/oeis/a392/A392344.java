package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a055.A055932;

/**
 * A392344 allocated for Ken Clements.
 * @author Sean A. Irvine
 */
public class A392344 extends Sequence1 {

  private static final long HEURISTIC = 5000; // actual test is twice this
  private long mN = 0;

  @Override
  public Z next() {
    final long n2 = ++mN * mN;
    final Sequence s = new A055932();
    Z best = null;
    while (true) {
      final Z a = s.next();
      final Z[] r = a.shiftLeft(2).add(n2).sqrtAndRemainder();
      if (r[1].isZero()) {
        final Z u = r[0].subtract(mN);
        if (u.isEven()) {
          best = u.divide2();
        }
      }
      if (best != null && r[0].compareTo(best.multiply(HEURISTIC)) > 0) {
        return best;
      }
    }
  }
}
