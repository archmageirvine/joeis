package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014611.
 * @author Sean A. Irvine
 */
public class A014611 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014611() {
    super(Cyclotomic.inverse(602));
  }
}
