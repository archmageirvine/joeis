package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014906 Inverse of 897th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014906 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014906() {
    super(Cyclotomic.inverse(897));
  }
}
