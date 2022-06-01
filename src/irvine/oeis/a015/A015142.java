package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015142 Inverse of 1133rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015142 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015142() {
    super(Cyclotomic.inverse(1133));
  }
}
