package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014691.
 * @author Sean A. Irvine
 */
public class A014691 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014691() {
    super(Cyclotomic.inverse(682));
  }
}
