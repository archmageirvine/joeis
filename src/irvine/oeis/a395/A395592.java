package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395592 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A395592 extends DecimalExpansionSequence {

  private static final CR SQRT13 = CR.valueOf(13).sqrt();

  /** Construct the sequence. */
  public A395592() {
    super(1, SQRT13.add(3).add(SQRT13.multiply(14).add(46).sqrt()).divide(4));
  }
}
