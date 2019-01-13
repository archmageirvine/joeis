package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015149.
 * @author Sean A. Irvine
 */
public class A015149 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015149() {
    super(Cyclotomic.inverse(1140));
  }
}
