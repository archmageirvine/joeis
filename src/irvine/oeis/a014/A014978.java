package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014978.
 * @author Sean A. Irvine
 */
public class A014978 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014978() {
    super(Cyclotomic.inverse(969));
  }
}
