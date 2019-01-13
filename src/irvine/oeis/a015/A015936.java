package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015936.
 * @author Sean A. Irvine
 */
public class A015936 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015936() {
    super(Cyclotomic.inverse(1927));
  }
}
