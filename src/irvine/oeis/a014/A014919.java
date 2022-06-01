package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014919 Inverse of 910th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014919 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014919() {
    super(Cyclotomic.inverse(910));
  }
}
