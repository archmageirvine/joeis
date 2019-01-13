package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015119.
 * @author Sean A. Irvine
 */
public class A015119 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015119() {
    super(Cyclotomic.inverse(1110));
  }
}
