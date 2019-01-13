package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015389.
 * @author Sean A. Irvine
 */
public class A015389 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015389() {
    super(Cyclotomic.inverse(1380));
  }
}
