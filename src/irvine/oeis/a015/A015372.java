package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015372.
 * @author Sean A. Irvine
 */
public class A015372 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015372() {
    super(Cyclotomic.inverse(1363));
  }
}
