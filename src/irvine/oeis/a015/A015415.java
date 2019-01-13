package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015415.
 * @author Sean A. Irvine
 */
public class A015415 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015415() {
    super(Cyclotomic.inverse(1406));
  }
}
