package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015269.
 * @author Sean A. Irvine
 */
public class A015269 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015269() {
    super(Cyclotomic.inverse(1260));
  }
}
