package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015852.
 * @author Sean A. Irvine
 */
public class A015852 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015852() {
    super(Cyclotomic.inverse(1843));
  }
}
