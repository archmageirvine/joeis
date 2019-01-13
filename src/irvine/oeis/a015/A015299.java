package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015299.
 * @author Sean A. Irvine
 */
public class A015299 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015299() {
    super(Cyclotomic.inverse(1290));
  }
}
