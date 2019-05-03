package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015573 Inverse of <code>1564th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015573 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015573() {
    super(Cyclotomic.inverse(1564));
  }
}
