package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014350.
 * @author Sean A. Irvine
 */
public class A014350 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014350() {
    super(Cyclotomic.inverse(341));
  }
}
