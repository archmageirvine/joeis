package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015241.
 * @author Sean A. Irvine
 */
public class A015241 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015241() {
    super(Cyclotomic.inverse(1232));
  }
}
