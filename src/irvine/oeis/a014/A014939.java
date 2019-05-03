package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014939 Inverse of <code>930th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014939 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014939() {
    super(Cyclotomic.inverse(930));
  }
}
