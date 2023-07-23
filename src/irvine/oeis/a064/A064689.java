package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064689 Smallest m such that A064672(m) = n.
 * @author Sean A. Irvine
 */
public class A064689 extends InverseSequence {

  /** Construct the sequence. */
  public A064689() {
    super(0, new A064672(), 0);
  }
}
