package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014478.
 * @author Sean A. Irvine
 */
public class A014478 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014478() {
    super(Cyclotomic.inverse(469));
  }
}
