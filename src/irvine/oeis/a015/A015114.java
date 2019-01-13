package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015114.
 * @author Sean A. Irvine
 */
public class A015114 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015114() {
    super(Cyclotomic.inverse(1105));
  }
}
