package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015692.
 * @author Sean A. Irvine
 */
public class A015692 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015692() {
    super(Cyclotomic.inverse(1683));
  }
}
