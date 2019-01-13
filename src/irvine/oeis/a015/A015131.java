package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015131.
 * @author Sean A. Irvine
 */
public class A015131 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015131() {
    super(Cyclotomic.inverse(1122));
  }
}
