package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015829.
 * @author Sean A. Irvine
 */
public class A015829 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015829() {
    super(Cyclotomic.inverse(1820));
  }
}
