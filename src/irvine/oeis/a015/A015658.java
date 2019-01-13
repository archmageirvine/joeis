package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015658.
 * @author Sean A. Irvine
 */
public class A015658 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015658() {
    super(Cyclotomic.inverse(1649));
  }
}
