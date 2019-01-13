package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015270.
 * @author Sean A. Irvine
 */
public class A015270 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015270() {
    super(Cyclotomic.inverse(1261));
  }
}
