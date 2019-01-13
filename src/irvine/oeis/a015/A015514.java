package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015514.
 * @author Sean A. Irvine
 */
public class A015514 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015514() {
    super(Cyclotomic.inverse(1505));
  }
}
