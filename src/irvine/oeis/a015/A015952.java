package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015952 Inverse of 1943rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015952 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015952() {
    super(Cyclotomic.inverse(1943));
  }
}
