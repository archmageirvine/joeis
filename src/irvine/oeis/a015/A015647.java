package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015647.
 * @author Sean A. Irvine
 */
public class A015647 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015647() {
    super(Cyclotomic.inverse(1638));
  }
}
