package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014789.
 * @author Sean A. Irvine
 */
public class A014789 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014789() {
    super(Cyclotomic.inverse(780));
  }
}
