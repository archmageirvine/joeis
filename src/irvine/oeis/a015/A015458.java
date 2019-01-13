package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015458.
 * @author Sean A. Irvine
 */
public class A015458 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015458() {
    super(Cyclotomic.inverse(1449));
  }
}
