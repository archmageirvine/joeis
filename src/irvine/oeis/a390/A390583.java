package irvine.oeis.a390;

import java.util.Collection;
import java.util.LinkedList;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390583 Rectangular array read by rows of ordered quadruples of coprime positive integers {r1..r4} for which circles of radius r1..r4 can be arranged as mutually externally tangent to one another, with rows in lexicographic order.
 * @author Sean A. Irvine
 */
public class A390583 extends Sequence1 {

  // After Charles L. Hohn

  private static final CR C1 = CR.TWO.divide(CR.THREE.sqrt()).subtract(1);
  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  protected void step(final Collection<Z> seq) {
    ++mN; // r1
    final CR n = CR.valueOf(mN);
    final Q q1 = new Q(1, mN);
    for (long r2 = mN + 1; r2 <= n.divide(C1).ceil().longValueExact(); ++r2) {
      final Q q2 = new Q(1, r2);
      for (long r3 = r2; r3 <= q1.add(q2).multiply(4).divide(q1.subtract(q2).square()).floor().longValueExact(); ++r3) {
        final Z a = Z.valueOf(r2 * r3);
        final Z b = Z.valueOf(mN * r3);
        final Z c = Z.valueOf(mN * r2);
        final Z t = a.multiply(b).add(a.multiply(c)).add(b.multiply(c));
        final Z sqrt = t.sqrt();
        if (t.auxiliary() == 1) {
          final Z u = a.add(b).add(c).subtract(sqrt.multiply2());
          if (u.signum() > 0) {
            final Z v = a.multiply(mN);
            final Z[] qr = v.divideAndRemainder(u);
            final long r4 = qr[0].longValueExact();
            if (qr[1].isZero() && Functions.GCD.l(mN, r2, r3, r4) == 1) {
              seq.add(Z.valueOf(mN));
              seq.add(Z.valueOf(r2));
              seq.add(Z.valueOf(r3));
              seq.add(Z.valueOf(r4));
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      step(mA);
    }
    return mA.pollFirst();
  }
}
