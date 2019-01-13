package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015604.
 * @author Sean A. Irvine
 */
public class A015604 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015604() {
    super(Cyclotomic.inverse(1595));
  }
}
