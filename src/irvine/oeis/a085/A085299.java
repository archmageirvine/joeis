package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085299 a(n) is the smallest number k such that A085298(k)=n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085299 extends InverseSequence {

  /** Construct the sequence. */
  public A085299() {
    super(1, 1, new A085298());
  }
}
