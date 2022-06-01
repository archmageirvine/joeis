package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016258 Inverse of 2249th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016258 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016258() {
    super(Cyclotomic.inverse(2249));
  }
}
