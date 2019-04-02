package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015828 Inverse of 1819th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015828 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015828() {
    super(Cyclotomic.inverse(1819));
  }
}
