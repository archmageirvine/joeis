package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014906 Inverse of <code>897th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014906 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014906() {
    super(Cyclotomic.inverse(897));
  }
}
