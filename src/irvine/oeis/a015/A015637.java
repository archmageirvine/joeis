package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015637.
 * @author Sean A. Irvine
 */
public class A015637 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015637() {
    super(Cyclotomic.inverse(1628));
  }
}
