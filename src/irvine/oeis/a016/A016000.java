package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016000 Inverse of 1991st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016000 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016000() {
    super(Cyclotomic.inverse(1991));
  }
}
