package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015619.
 * @author Sean A. Irvine
 */
public class A015619 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015619() {
    super(Cyclotomic.inverse(1610));
  }
}
