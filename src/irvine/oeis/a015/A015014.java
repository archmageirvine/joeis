package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015014.
 * @author Sean A. Irvine
 */
public class A015014 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015014() {
    super(Cyclotomic.inverse(1005));
  }
}
