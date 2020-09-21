package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A034990 a(n)^2 is smallest square starting with a string of n 7's.
 * @author Sean A. Irvine
 */
public class A034990 extends A034982 {

  private static final CR N1 = CR.valueOf(new Q(7, 9)).sqrt();
  private static final CR N2 = CR.valueOf(new Q(7, 90)).sqrt();

  /** Construct the sequence. */
  public A034990() {
    super(new DecimalExpansionSequence() {
            @Override
            protected CR getCR() {
              return N1;
            }
          },
      new DecimalExpansionSequence() {
        @Override
        protected CR getCR() {
          return N2;
        }
      }, "7", "");
  }
}
