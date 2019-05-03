package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015828 Inverse of <code>1819th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015828 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015828() {
    super(Cyclotomic.inverse(1819));
  }
}
