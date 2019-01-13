package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015156.
 * @author Sean A. Irvine
 */
public class A015156 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015156() {
    super(Cyclotomic.inverse(1147));
  }
}
