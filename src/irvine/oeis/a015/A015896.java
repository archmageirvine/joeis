package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015896.
 * @author Sean A. Irvine
 */
public class A015896 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015896() {
    super(Cyclotomic.inverse(1887));
  }
}
