package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015981.
 * @author Sean A. Irvine
 */
public class A015981 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015981() {
    super(Cyclotomic.inverse(1972));
  }
}
