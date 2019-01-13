package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015012.
 * @author Sean A. Irvine
 */
public class A015012 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015012() {
    super(Cyclotomic.inverse(1003));
  }
}
