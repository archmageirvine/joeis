package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016132 Inverse of 2123rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016132 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016132() {
    super(Cyclotomic.inverse(2123));
  }
}
