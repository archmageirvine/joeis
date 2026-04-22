package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.oeis.a023.A023117;

/**
 * A084532 Signature sequence of 1/phi = phi-1 = (sqrt(5)-1)/2 = 0.61803...
 * @author Sean A. Irvine
 */
public class A084532 extends A023117 {

  /** Construct the sequence. */
  public A084532() {
    super(CR.PHI.inverse());
  }
}
