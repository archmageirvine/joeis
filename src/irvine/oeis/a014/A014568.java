package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014568 Inverse of 559th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014568 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014568() {
    super(Cyclotomic.inverse(559));
  }
}
