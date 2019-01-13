package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015824.
 * @author Sean A. Irvine
 */
public class A015824 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015824() {
    super(Cyclotomic.inverse(1815));
  }
}
