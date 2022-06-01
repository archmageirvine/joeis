package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015156 Inverse of 1147th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015156 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015156() {
    super(Cyclotomic.inverse(1147));
  }
}
