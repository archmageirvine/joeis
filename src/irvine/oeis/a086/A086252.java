package irvine.oeis.a086;

import irvine.oeis.InverseSequence;

/**
 * A086252 a(n) is the smallest k such that 2^k-1 has n primitive prime factors.
 * @author Sean A. Irvine
 */
public class A086252 extends InverseSequence {

  /** Construct the sequence. */
  public A086252() {
    super(1, new A086251());
  }
}
