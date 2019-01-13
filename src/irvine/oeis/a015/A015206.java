package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015206.
 * @author Sean A. Irvine
 */
public class A015206 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015206() {
    super(Cyclotomic.inverse(1197));
  }
}
