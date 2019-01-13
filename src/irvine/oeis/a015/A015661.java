package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015661.
 * @author Sean A. Irvine
 */
public class A015661 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015661() {
    super(Cyclotomic.inverse(1652));
  }
}
