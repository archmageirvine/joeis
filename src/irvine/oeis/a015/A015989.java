package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015989.
 * @author Sean A. Irvine
 */
public class A015989 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015989() {
    super(Cyclotomic.inverse(1980));
  }
}
