package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015621.
 * @author Sean A. Irvine
 */
public class A015621 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015621() {
    super(Cyclotomic.inverse(1612));
  }
}
