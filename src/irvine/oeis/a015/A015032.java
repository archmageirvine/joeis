package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015032.
 * @author Sean A. Irvine
 */
public class A015032 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015032() {
    super(Cyclotomic.inverse(1023));
  }
}
