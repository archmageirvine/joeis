package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000720;

/**
 * A046992 a(n) = Sum_{k=1..n} pi(k) (cf. A000720).
 * @author Sean A. Irvine
 */
public class A046992 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046992() {
    super(1, new A000720());
  }
}
