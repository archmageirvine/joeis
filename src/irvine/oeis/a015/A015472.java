package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015472 Inverse of 1463rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015472 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015472() {
    super(Cyclotomic.inverse(1463));
  }
}
