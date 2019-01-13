package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016258.
 * @author Sean A. Irvine
 */
public class A016258 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016258() {
    super(Cyclotomic.inverse(2249));
  }
}
