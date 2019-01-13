package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015978.
 * @author Sean A. Irvine
 */
public class A015978 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015978() {
    super(Cyclotomic.inverse(1969));
  }
}
