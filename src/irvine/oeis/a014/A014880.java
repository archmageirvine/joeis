package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014880 Inverse of 871st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014880 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014880() {
    super(Cyclotomic.inverse(871));
  }
}
