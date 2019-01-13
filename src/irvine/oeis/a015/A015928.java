package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015928.
 * @author Sean A. Irvine
 */
public class A015928 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015928() {
    super(Cyclotomic.inverse(1919));
  }
}
