package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015550 Inverse of 1541st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015550 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015550() {
    super(Cyclotomic.inverse(1541));
  }
}
