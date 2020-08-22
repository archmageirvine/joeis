package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014317 Inverse of 308th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014317 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014317() {
    super(Cyclotomic.inverse(308));
  }
}
