package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015024.
 * @author Sean A. Irvine
 */
public class A015024 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015024() {
    super(Cyclotomic.inverse(1015));
  }
}
