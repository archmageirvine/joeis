package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015790.
 * @author Sean A. Irvine
 */
public class A015790 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015790() {
    super(Cyclotomic.inverse(1781));
  }
}
