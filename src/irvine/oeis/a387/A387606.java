package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387606 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A387606 extends DecimalExpansionSequence {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A387606() {
    super(1, SQRT5.subtract(2).sqrt().divide(3).add(ComputableReals.SINGLETON.asin(SQRT5.subtract(1).divide(2).sqrt())));
  }
}

