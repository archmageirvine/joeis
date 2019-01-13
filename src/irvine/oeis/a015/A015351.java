package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015351.
 * @author Sean A. Irvine
 */
public class A015351 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015351() {
    super(Cyclotomic.inverse(1342));
  }
}
