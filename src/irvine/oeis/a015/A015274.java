package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015274 Inverse of 1265th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015274 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015274() {
    super(Cyclotomic.inverse(1265));
  }
}
