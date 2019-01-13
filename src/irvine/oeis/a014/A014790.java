package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014790.
 * @author Sean A. Irvine
 */
public class A014790 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014790() {
    super(Cyclotomic.inverse(781));
  }
}
