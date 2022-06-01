package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015218 Inverse of 1209th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015218 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015218() {
    super(Cyclotomic.inverse(1209));
  }
}
