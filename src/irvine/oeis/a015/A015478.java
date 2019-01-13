package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015478.
 * @author Sean A. Irvine
 */
public class A015478 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015478() {
    super(Cyclotomic.inverse(1469));
  }
}
