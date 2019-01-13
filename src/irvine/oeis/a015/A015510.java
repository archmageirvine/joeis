package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015510.
 * @author Sean A. Irvine
 */
public class A015510 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015510() {
    super(Cyclotomic.inverse(1501));
  }
}
