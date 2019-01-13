package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016156.
 * @author Sean A. Irvine
 */
public class A016156 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016156() {
    super(Cyclotomic.inverse(2147));
  }
}
