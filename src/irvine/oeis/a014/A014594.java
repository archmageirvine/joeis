package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014594 Inverse of 585th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014594 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014594() {
    super(Cyclotomic.inverse(585));
  }
}
