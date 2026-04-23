package irvine.oeis.a395;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395139 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A395139 extends DecimalExpansionSequence {

  private static final ComputableComplexField F = ComputableComplexField.SINGLETON;
  private static final CC THREE = new CC(3);
  private static final CC ACOS = F.acos(new CC(new Q(29, 2)));
  private static final CC S = new CC(CR.TAU.divide(3));
  private static final CC TWO_THIRDS = new CC(new Q(2, 3));

  /** Construct the sequence. */
  public A395139() {
    super(0, F.multiply(F.cos(F.subtract(F.divide(ACOS, THREE), S)), TWO_THIRDS).im());
  }
}
