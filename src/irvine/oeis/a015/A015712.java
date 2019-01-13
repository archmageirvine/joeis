package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015712.
 * @author Sean A. Irvine
 */
public class A015712 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015712() {
    super(Cyclotomic.inverse(1703));
  }
}
