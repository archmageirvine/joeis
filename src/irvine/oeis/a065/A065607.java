package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065607 Related to reciprocal Pythagorean triples: 1/a(n)^2 + 1/k^2 = 1/j^2 has an integer solution (k,j) with k&lt;a(n).
 * @author Sean A. Irvine
 */
public class A065607 extends Sequence1 {

  private long mN = 20;
  private Q mQ = new Q(1, 400);
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        mQ = new Q(1, ++mN * mN);
        mM = 1;
      }
      final Q t = mQ.add(new Q(1, mM * mM)).reciprocal();
      if (t.isInteger() && t.toZ().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
