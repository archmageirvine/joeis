package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015029.
 * @author Sean A. Irvine
 */
public class A015029 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015029() {
    super(Cyclotomic.inverse(1020));
  }
}
