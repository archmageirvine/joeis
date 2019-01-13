package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014947.
 * @author Sean A. Irvine
 */
public class A014947 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014947() {
    super(Cyclotomic.inverse(938));
  }
}
