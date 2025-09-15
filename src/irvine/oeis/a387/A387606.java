package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387606 Decimal expansion of the area of the half-plane of the positive ordinates bounded between the curves of equations x^2 + y^2 = 1 and y = x^2.
 * @author Sean A. Irvine
 */
public class A387606 extends DecimalExpansionSequence {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A387606() {
    super(1, SQRT5.subtract(2).sqrt().divide(3).add(ComputableReals.SINGLETON.asin(SQRT5.subtract(1).divide(2).sqrt())));
  }
}

