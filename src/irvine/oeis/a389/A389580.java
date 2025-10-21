package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a388.A388856;

/**
 * A389580 Increasing partition array based on the fractional parts of (n*e); see A388853.
 * @author Sean A. Irvine
 */
public class A389580 extends A388856 {

  /** Construct the sequence. */
  public A389580() {
    super(n -> CR.E.multiply(n).frac());
  }
}

