package irvine.oeis.a392;

import irvine.oeis.a066.A066417;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A392310 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A392310 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A392310() {
    super(0, new A066417().skip());
  }
}

