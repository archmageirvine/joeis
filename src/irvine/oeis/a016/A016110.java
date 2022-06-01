package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016110 Inverse of 2101st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016110 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016110() {
    super(Cyclotomic.inverse(2101));
  }
}
