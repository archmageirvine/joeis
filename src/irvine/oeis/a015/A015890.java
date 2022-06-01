package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015890 Inverse of 1881st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015890 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015890() {
    super(Cyclotomic.inverse(1881));
  }
}
