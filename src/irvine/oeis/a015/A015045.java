package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015045.
 * @author Sean A. Irvine
 */
public class A015045 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015045() {
    super(Cyclotomic.inverse(1036));
  }
}
