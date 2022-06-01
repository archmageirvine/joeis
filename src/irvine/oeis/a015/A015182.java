package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015182 Inverse of 1173rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015182 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015182() {
    super(Cyclotomic.inverse(1173));
  }
}
