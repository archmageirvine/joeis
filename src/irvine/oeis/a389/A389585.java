package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a385.A385573;

/**
 * A389585 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A389585 extends A385573 {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A389585() {
    super(n -> SQRT5.multiply(n).frac());
  }
}

