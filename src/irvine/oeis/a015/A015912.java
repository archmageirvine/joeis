package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015912 Inverse of 1903rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015912 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015912() {
    super(Cyclotomic.inverse(1903));
  }
}
