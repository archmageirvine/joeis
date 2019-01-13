package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016242.
 * @author Sean A. Irvine
 */
public class A016242 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016242() {
    super(Cyclotomic.inverse(2233));
  }
}
