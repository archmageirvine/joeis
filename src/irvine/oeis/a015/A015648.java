package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015648.
 * @author Sean A. Irvine
 */
public class A015648 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015648() {
    super(Cyclotomic.inverse(1639));
  }
}
