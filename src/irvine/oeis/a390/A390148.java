package irvine.oeis.a390;

import java.util.Collection;
import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390148 Rectangular array by row of quadruples of coprime positive integers {r1..r4} for which spheres of radius r1..r4 are tangent to a plane when arranged as mutually tangent to one another, in increasing order within each quadruple row and then by column left to right.
 * @author Sean A. Irvine
 */
public class A390148 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  protected void step(final Collection<Z> seq) {
    ++mN; // r1
    final Q q1 = new Q(1, mN);
    for (long r2 = mN; r2 <= 3 * mN; ++r2) {
      final Q q2 = new Q(1, r2);
      for (long r3 = r2; r3 <= 4 * mN; ++r3) {
        final Q q3 = new Q(1, r3);
        final Q a = q1.add(q2).add(q3);
        final Q b = q1.square().add(q2.square()).add(q3.square());
        final Q d2 = a.square().multiply(3).subtract(b.multiply(6));
        if (d2.isSquare()) {
          final Q d = d2.sqrt();
          final Q e = b.multiply(3).subtract(a.square());
          if (!e.isZero()) {
            final Q soln1 = a.add(d).divide(e);
            if (soln1.isInteger()) {
              final long r4 = soln1.toZ().longValueExact();
              if (r4 >= r3 && Functions.GCD.l(mN, r2, r3, r4) == 1) {
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
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      step(mA);
    }
    return mA.pollFirst();
  }
}
