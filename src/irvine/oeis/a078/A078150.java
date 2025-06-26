package irvine.oeis.a078;

import irvine.oeis.InverseSequence;
import irvine.oeis.a385.A385122;

/**
 * A078150 Smallest k such that d(phi(k)) - phi(d(k)) = n, where d(k) = A000005(k) and phi(k) = A000010(k).
 * @author Sean A. Irvine
 */
public class A078150 extends InverseSequence {

  /** Construct the sequence. */
  public A078150() {
    super(1, new A385122());
  }
}
