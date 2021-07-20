package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A000796 Decimal expansion of Pi (or digits of Pi).
 * @author Sean A. Irvine
 */
public class A000796 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A000796() {
    super(CR.PI);
  }
}
