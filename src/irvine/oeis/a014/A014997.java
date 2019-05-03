package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014997 Inverse of <code>988th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014997 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014997() {
    super(Cyclotomic.inverse(988));
  }
}
