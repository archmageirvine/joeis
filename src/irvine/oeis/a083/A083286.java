package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083286 Decimal expansion of K(3), a constant related to the Josephus problem.
 * @author Sean A. Irvine
 */
public class A083286 extends DecimalExpansionSequence implements Conjectural {

  private static final CR C = CR.valueOf(new Q(3, 2));
  private static final int HEURISTIC = 10;

  /** Construct the sequence. */
  public A083286() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z p = Z.ONE;
        Z z = Z.ZERO;
        long k = 0;
        int equalsCount = 0;
        while (true) {
          p = p.multiply(3).add(1).divide2();
          final Z t = CR.valueOf(p).divide(C.pow(++k)).getApprox(precision);
          if (t.equals(z)) {
            if (++equalsCount > HEURISTIC) {
              return t;
            }
          } else {
            equalsCount = 0;
          }
          z = t;
        }
      }
    });
  }
}
