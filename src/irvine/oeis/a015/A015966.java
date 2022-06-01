package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015966 Inverse of 1957th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015966 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015966() {
    super(Cyclotomic.inverse(1957));
  }
}
