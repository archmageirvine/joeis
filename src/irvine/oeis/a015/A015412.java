package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015412.
 * @author Sean A. Irvine
 */
public class A015412 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015412() {
    super(Cyclotomic.inverse(1403));
  }
}
