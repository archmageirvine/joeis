package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015182.
 * @author Sean A. Irvine
 */
public class A015182 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015182() {
    super(Cyclotomic.inverse(1173));
  }
}
