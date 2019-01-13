package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014791.
 * @author Sean A. Irvine
 */
public class A014791 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014791() {
    super(Cyclotomic.inverse(782));
  }
}
