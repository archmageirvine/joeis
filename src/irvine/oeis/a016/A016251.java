package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016251 Inverse of 2242nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016251 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016251() {
    super(Cyclotomic.inverse(2242));
  }
}
