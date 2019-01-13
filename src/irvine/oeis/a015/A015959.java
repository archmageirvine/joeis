package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015959.
 * @author Sean A. Irvine
 */
public class A015959 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015959() {
    super(Cyclotomic.inverse(1950));
  }
}
