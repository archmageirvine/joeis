package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015869.
 * @author Sean A. Irvine
 */
public class A015869 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015869() {
    super(Cyclotomic.inverse(1860));
  }
}
