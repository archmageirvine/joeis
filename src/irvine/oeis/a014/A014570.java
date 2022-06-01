package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014570 Inverse of 561st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014570 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014570() {
    super(Cyclotomic.inverse(561));
  }
}
