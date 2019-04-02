package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015642 Inverse of 1633rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015642 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015642() {
    super(Cyclotomic.inverse(1633));
  }
}
