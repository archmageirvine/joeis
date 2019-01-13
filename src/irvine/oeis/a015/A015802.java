package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015802.
 * @author Sean A. Irvine
 */
public class A015802 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015802() {
    super(Cyclotomic.inverse(1793));
  }
}
