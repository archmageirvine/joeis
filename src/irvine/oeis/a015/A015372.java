package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015372 Inverse of 1363rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015372 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015372() {
    super(Cyclotomic.inverse(1363));
  }
}
