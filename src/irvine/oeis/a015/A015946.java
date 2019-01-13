package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015946.
 * @author Sean A. Irvine
 */
public class A015946 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015946() {
    super(Cyclotomic.inverse(1937));
  }
}
