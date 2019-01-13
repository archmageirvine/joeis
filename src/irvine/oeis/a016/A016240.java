package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016240.
 * @author Sean A. Irvine
 */
public class A016240 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016240() {
    super(Cyclotomic.inverse(2231));
  }
}
