package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A062964 Pi in hexadecimal.
 * @author Sean A. Irvine
 */
public class A062964 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A062964() {
    super(1, CR.PI, 16);
  }
}
