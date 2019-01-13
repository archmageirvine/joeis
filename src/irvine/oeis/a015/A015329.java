package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015329.
 * @author Sean A. Irvine
 */
public class A015329 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015329() {
    super(Cyclotomic.inverse(1320));
  }
}
