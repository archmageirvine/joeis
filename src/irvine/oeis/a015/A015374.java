package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015374.
 * @author Sean A. Irvine
 */
public class A015374 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015374() {
    super(Cyclotomic.inverse(1365));
  }
}
