package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015073.
 * @author Sean A. Irvine
 */
public class A015073 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015073() {
    super(Cyclotomic.inverse(1064));
  }
}
