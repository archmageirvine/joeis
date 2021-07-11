package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004603 Expansion of Pi in base 2 (or, binary expansion of Pi).
 * @author Sean A. Irvine
 */
public class A004603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004603() {
    super(0, CR.PI, 4);
  }
}
