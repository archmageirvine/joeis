package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015510 Inverse of 1501st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015510 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015510() {
    super(Cyclotomic.inverse(1501));
  }
}
