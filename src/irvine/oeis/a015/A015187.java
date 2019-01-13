package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015187.
 * @author Sean A. Irvine
 */
public class A015187 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015187() {
    super(Cyclotomic.inverse(1178));
  }
}
