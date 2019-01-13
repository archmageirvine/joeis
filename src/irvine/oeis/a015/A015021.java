package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015021.
 * @author Sean A. Irvine
 */
public class A015021 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015021() {
    super(Cyclotomic.inverse(1012));
  }
}
