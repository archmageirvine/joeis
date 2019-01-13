package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014966.
 * @author Sean A. Irvine
 */
public class A014966 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014966() {
    super(Cyclotomic.inverse(957));
  }
}
