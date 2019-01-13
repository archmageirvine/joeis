package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015199.
 * @author Sean A. Irvine
 */
public class A015199 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015199() {
    super(Cyclotomic.inverse(1190));
  }
}
