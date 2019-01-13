package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015179.
 * @author Sean A. Irvine
 */
public class A015179 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015179() {
    super(Cyclotomic.inverse(1170));
  }
}
