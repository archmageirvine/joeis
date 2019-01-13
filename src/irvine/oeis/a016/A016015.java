package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016015.
 * @author Sean A. Irvine
 */
public class A016015 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016015() {
    super(Cyclotomic.inverse(2006));
  }
}
