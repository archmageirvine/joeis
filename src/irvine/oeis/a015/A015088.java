package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015088.
 * @author Sean A. Irvine
 */
public class A015088 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015088() {
    super(Cyclotomic.inverse(1079));
  }
}
