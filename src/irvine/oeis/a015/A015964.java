package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015964.
 * @author Sean A. Irvine
 */
public class A015964 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015964() {
    super(Cyclotomic.inverse(1955));
  }
}
