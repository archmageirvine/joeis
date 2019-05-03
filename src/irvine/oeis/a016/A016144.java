package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016144 Inverse of <code>2135th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016144 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016144() {
    super(Cyclotomic.inverse(2135));
  }
}
