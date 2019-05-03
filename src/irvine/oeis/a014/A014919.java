package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014919 Inverse of <code>910th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014919 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014919() {
    super(Cyclotomic.inverse(910));
  }
}
