package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015738.
 * @author Sean A. Irvine
 */
public class A015738 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015738() {
    super(Cyclotomic.inverse(1729));
  }
}
