package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015605.
 * @author Sean A. Irvine
 */
public class A015605 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015605() {
    super(Cyclotomic.inverse(1596));
  }
}
