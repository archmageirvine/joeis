package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015659.
 * @author Sean A. Irvine
 */
public class A015659 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015659() {
    super(Cyclotomic.inverse(1650));
  }
}
