package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015010.
 * @author Sean A. Irvine
 */
public class A015010 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015010() {
    super(Cyclotomic.inverse(1001));
  }
}
