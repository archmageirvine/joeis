package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014179.
 * @author Sean A. Irvine
 */
public class A014179 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014179() {
    super(Cyclotomic.inverse(170));
  }
}
