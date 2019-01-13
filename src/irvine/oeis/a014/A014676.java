package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014676.
 * @author Sean A. Irvine
 */
public class A014676 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014676() {
    super(Cyclotomic.inverse(667));
  }
}
