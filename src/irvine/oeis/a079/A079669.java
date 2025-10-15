package irvine.oeis.a079;

import irvine.oeis.InverseSequence;

/**
 * A079669 a(n) = least k such that the distance from Fibonacci(k) to the closest prime is n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A079669 extends InverseSequence {

  /** Construct the sequence. */
  public A079669() {
    super(0, 0, new A079677());
  }
}

