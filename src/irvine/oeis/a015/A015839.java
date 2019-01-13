package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015839.
 * @author Sean A. Irvine
 */
public class A015839 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015839() {
    super(Cyclotomic.inverse(1830));
  }
}
