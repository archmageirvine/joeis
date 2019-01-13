package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015835.
 * @author Sean A. Irvine
 */
public class A015835 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015835() {
    super(Cyclotomic.inverse(1826));
  }
}
