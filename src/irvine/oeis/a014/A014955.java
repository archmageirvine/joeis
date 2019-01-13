package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014955.
 * @author Sean A. Irvine
 */
public class A014955 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014955() {
    super(Cyclotomic.inverse(946));
  }
}
