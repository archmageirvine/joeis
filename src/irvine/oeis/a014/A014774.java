package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014774 Inverse of 765th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014774 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014774() {
    super(Cyclotomic.inverse(765));
  }
}
