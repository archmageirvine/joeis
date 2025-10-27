package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a385.A385573;

/**
 * A389585 Decreasing partition array based on the fractional parts of (n*sqrt(5)); see A388853.
 * @author Sean A. Irvine
 */
public class A389585 extends A385573 {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A389585() {
    super(n -> SQRT5.multiply(n).frac());
  }
}

