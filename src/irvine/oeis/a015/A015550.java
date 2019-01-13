package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015550.
 * @author Sean A. Irvine
 */
public class A015550 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015550() {
    super(Cyclotomic.inverse(1541));
  }
}
