package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015142.
 * @author Sean A. Irvine
 */
public class A015142 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015142() {
    super(Cyclotomic.inverse(1133));
  }
}
