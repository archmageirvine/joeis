package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015779.
 * @author Sean A. Irvine
 */
public class A015779 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015779() {
    super(Cyclotomic.inverse(1770));
  }
}
