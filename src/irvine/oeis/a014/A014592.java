package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014592.
 * @author Sean A. Irvine
 */
public class A014592 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014592() {
    super(Cyclotomic.inverse(583));
  }
}
