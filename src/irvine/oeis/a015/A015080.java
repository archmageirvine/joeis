package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015080 Inverse of 1071st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015080 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015080() {
    super(Cyclotomic.inverse(1071));
  }
}
