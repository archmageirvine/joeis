package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015284.
 * @author Sean A. Irvine
 */
public class A015284 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015284() {
    super(Cyclotomic.inverse(1275));
  }
}
