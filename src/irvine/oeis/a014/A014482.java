package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014482.
 * @author Sean A. Irvine
 */
public class A014482 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014482() {
    super(Cyclotomic.inverse(473));
  }
}
