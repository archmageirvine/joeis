package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015208.
 * @author Sean A. Irvine
 */
public class A015208 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015208() {
    super(Cyclotomic.inverse(1199));
  }
}
