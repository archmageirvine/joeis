package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014698.
 * @author Sean A. Irvine
 */
public class A014698 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014698() {
    super(Cyclotomic.inverse(689));
  }
}
