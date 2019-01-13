package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015760.
 * @author Sean A. Irvine
 */
public class A015760 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015760() {
    super(Cyclotomic.inverse(1751));
  }
}
