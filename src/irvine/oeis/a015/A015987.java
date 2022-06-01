package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015987 Inverse of 1978th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015987 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015987() {
    super(Cyclotomic.inverse(1978));
  }
}
