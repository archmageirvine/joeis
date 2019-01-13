package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015517.
 * @author Sean A. Irvine
 */
public class A015517 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015517() {
    super(Cyclotomic.inverse(1508));
  }
}
