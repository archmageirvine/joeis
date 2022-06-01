package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014191 Inverse of 182nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014191 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014191() {
    super(Cyclotomic.inverse(182));
  }
}
