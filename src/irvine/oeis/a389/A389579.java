package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.a385.A385573;

/**
 * A389579 Decreasing partition array based on the fractional parts of tan(n); see Comments.
 * @author Sean A. Irvine
 */
public class A389579 extends A385573 {

  /** Construct the sequence. */
  public A389579() {
    super(n -> ComputableReals.SINGLETON.tan(CR.valueOf(n)).frac());
  }
}

