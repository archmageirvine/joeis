package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014165.
 * @author Sean A. Irvine
 */
public class A014165 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014165() {
    super(Cyclotomic.inverse(156));
  }
}
