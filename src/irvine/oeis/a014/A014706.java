package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014706 Inverse of 697th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014706 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014706() {
    super(Cyclotomic.inverse(697));
  }
}
