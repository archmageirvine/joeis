package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015250.
 * @author Sean A. Irvine
 */
public class A015250 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015250() {
    super(Cyclotomic.inverse(1241));
  }
}
