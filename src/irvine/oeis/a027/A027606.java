package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A027606 e in duodecimal.
 * @author Sean A. Irvine
 */
public class A027606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A027606() {
    super(0, CR.E, 12);
  }
}
