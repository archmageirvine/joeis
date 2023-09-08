package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065643 Smallest integer value &gt; 1 of the form floor((3/2)^k)/floor((3/2)^n).
 * @author Sean A. Irvine
 */
public class A065643 extends Sequence1 {

  private static final Q THREE_HALVES = new Q(3, 2);
  private long mN = 0;

  @Override
  public Z next() {
    final Q s = THREE_HALVES.pow(++mN);
    final Z t = s.toZ();
    Q r = s;
    while (true) {
      r = r.multiply(THREE_HALVES);
      final Q v = new Q(r.toZ(), t);
      if (v.isInteger() && v.compareTo(Q.ONE) > 0) {
        return v.toZ();
      }
    }
  }
}

