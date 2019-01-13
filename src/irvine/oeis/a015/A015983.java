package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015983.
 * @author Sean A. Irvine
 */
public class A015983 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015983() {
    super(Cyclotomic.inverse(1974));
  }
}
