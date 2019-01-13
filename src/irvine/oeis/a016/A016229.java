package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016229.
 * @author Sean A. Irvine
 */
public class A016229 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016229() {
    super(Cyclotomic.inverse(2220));
  }
}
