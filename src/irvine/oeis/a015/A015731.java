package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015731.
 * @author Sean A. Irvine
 */
public class A015731 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015731() {
    super(Cyclotomic.inverse(1722));
  }
}
