package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015890.
 * @author Sean A. Irvine
 */
public class A015890 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015890() {
    super(Cyclotomic.inverse(1881));
  }
}
