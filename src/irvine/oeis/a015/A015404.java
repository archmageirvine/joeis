package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015404.
 * @author Sean A. Irvine
 */
public class A015404 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015404() {
    super(Cyclotomic.inverse(1395));
  }
}
