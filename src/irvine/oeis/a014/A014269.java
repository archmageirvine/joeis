package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014269.
 * @author Sean A. Irvine
 */
public class A014269 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014269() {
    super(Cyclotomic.inverse(260));
  }
}
