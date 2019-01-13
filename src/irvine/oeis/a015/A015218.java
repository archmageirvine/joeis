package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015218.
 * @author Sean A. Irvine
 */
public class A015218 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015218() {
    super(Cyclotomic.inverse(1209));
  }
}
