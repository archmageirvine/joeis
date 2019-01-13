package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015452.
 * @author Sean A. Irvine
 */
public class A015452 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015452() {
    super(Cyclotomic.inverse(1443));
  }
}
