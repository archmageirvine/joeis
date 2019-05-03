package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015966 Inverse of <code>1957th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015966 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015966() {
    super(Cyclotomic.inverse(1957));
  }
}
