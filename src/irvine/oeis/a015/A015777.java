package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015777.
 * @author Sean A. Irvine
 */
public class A015777 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015777() {
    super(Cyclotomic.inverse(1768));
  }
}
