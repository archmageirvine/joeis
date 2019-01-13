package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015488.
 * @author Sean A. Irvine
 */
public class A015488 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015488() {
    super(Cyclotomic.inverse(1479));
  }
}
