package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014394.
 * @author Sean A. Irvine
 */
public class A014394 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014394() {
    super(Cyclotomic.inverse(385));
  }
}
