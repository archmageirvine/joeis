package irvine.oeis.a385;

import irvine.oeis.InverseSequence;

/**
 * A385499 a(n) is the smallest integer k such that A385392(k) = n.
 * @author Sean A. Irvine
 */
public class A385499 extends InverseSequence {

  /** Construct the sequence. */
  public A385499() {
    super(1, new A385392());
  }
}

