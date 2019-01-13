package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015838.
 * @author Sean A. Irvine
 */
public class A015838 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015838() {
    super(Cyclotomic.inverse(1829));
  }
}
