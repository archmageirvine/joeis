package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a388.A388856;

/**
 * A389584 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A389584 extends A388856 {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A389584() {
    super(n -> SQRT5.multiply(n).frac());
  }
}

