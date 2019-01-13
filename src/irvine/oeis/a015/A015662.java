package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015662.
 * @author Sean A. Irvine
 */
public class A015662 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015662() {
    super(Cyclotomic.inverse(1653));
  }
}
