package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014750.
 * @author Sean A. Irvine
 */
public class A014750 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014750() {
    super(Cyclotomic.inverse(741));
  }
}
