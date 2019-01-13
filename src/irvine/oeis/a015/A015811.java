package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015811.
 * @author Sean A. Irvine
 */
public class A015811 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015811() {
    super(Cyclotomic.inverse(1802));
  }
}
