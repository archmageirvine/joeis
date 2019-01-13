package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014446.
 * @author Sean A. Irvine
 */
public class A014446 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014446() {
    super(Cyclotomic.inverse(437));
  }
}
