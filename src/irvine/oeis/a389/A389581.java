package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a385.A385573;

/**
 * A389581 Decreasing partition array based on the fractional parts of (n*e); see A388853.
 * @author Sean A. Irvine
 */
public class A389581 extends A385573 {

  /** Construct the sequence. */
  public A389581() {
    super(n -> CR.E.multiply(n).frac());
  }
}

