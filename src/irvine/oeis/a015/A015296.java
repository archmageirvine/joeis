package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015296.
 * @author Sean A. Irvine
 */
public class A015296 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015296() {
    super(Cyclotomic.inverse(1287));
  }
}
