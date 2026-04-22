package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.oeis.a023.A023117;

/**
 * A084531 Signature sequence of phi = (1+sqrt(5))/2 = 1.61803...
 * @author Sean A. Irvine
 */
public class A084531 extends A023117 {

  /** Construct the sequence. */
  public A084531() {
    super(CR.PHI);
  }
}
