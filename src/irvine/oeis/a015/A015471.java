package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015471.
 * @author Sean A. Irvine
 */
public class A015471 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015471() {
    super(Cyclotomic.inverse(1462));
  }
}
