package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015674.
 * @author Sean A. Irvine
 */
public class A015674 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015674() {
    super(Cyclotomic.inverse(1665));
  }
}
