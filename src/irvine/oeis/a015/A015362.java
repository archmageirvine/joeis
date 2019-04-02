package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015362 Inverse of 1353rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015362 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015362() {
    super(Cyclotomic.inverse(1353));
  }
}
