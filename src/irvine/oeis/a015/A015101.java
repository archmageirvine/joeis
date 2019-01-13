package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015101.
 * @author Sean A. Irvine
 */
public class A015101 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015101() {
    super(Cyclotomic.inverse(1092));
  }
}
