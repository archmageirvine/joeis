package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016275.
 * @author Sean A. Irvine
 */
public class A016275 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016275() {
    super(Cyclotomic.inverse(2266));
  }
}
