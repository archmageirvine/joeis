package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.a388.A388856;

/**
 * A389578 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A389578 extends A388856 {

  /** Construct the sequence. */
  public A389578() {
    super(n -> ComputableReals.SINGLETON.tan(CR.valueOf(n)).frac());
  }
}

