package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015216 Inverse of 1207th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015216 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015216() {
    super(Cyclotomic.inverse(1207));
  }
}
