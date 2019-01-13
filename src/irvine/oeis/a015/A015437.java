package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015437.
 * @author Sean A. Irvine
 */
public class A015437 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015437() {
    super(Cyclotomic.inverse(1428));
  }
}
