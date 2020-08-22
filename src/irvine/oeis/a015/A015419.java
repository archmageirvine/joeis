package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015419 Inverse of 1410th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015419 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015419() {
    super(Cyclotomic.inverse(1410));
  }
}
