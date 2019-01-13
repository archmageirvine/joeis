package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015899.
 * @author Sean A. Irvine
 */
public class A015899 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015899() {
    super(Cyclotomic.inverse(1890));
  }
}
