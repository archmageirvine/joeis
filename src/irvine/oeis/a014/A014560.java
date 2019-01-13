package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014560.
 * @author Sean A. Irvine
 */
public class A014560 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014560() {
    super(Cyclotomic.inverse(551));
  }
}
