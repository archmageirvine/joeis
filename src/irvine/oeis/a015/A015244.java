package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015244.
 * @author Sean A. Irvine
 */
public class A015244 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015244() {
    super(Cyclotomic.inverse(1235));
  }
}
