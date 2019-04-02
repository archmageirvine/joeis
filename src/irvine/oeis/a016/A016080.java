package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016080 Inverse of 2071st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016080 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016080() {
    super(Cyclotomic.inverse(2071));
  }
}
