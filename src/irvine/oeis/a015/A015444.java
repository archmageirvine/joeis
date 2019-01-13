package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015444.
 * @author Sean A. Irvine
 */
public class A015444 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015444() {
    super(Cyclotomic.inverse(1435));
  }
}
