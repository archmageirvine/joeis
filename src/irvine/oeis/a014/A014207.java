package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014207.
 * @author Sean A. Irvine
 */
public class A014207 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014207() {
    super(Cyclotomic.inverse(198));
  }
}
