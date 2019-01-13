package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014902.
 * @author Sean A. Irvine
 */
public class A014902 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014902() {
    super(Cyclotomic.inverse(893));
  }
}
