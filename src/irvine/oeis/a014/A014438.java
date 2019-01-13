package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014438.
 * @author Sean A. Irvine
 */
public class A014438 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014438() {
    super(Cyclotomic.inverse(429));
  }
}
