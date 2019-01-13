package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015778.
 * @author Sean A. Irvine
 */
public class A015778 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015778() {
    super(Cyclotomic.inverse(1769));
  }
}
