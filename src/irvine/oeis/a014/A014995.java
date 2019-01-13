package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014995.
 * @author Sean A. Irvine
 */
public class A014995 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014995() {
    super(Cyclotomic.inverse(986));
  }
}
