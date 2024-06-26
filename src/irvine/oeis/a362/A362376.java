package irvine.oeis.a362;
// manually 2024-05-25

import irvine.oeis.a000.A000045;
import irvine.oeis.a363.A363533;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A362376 a(n) is the least k such that Fibonacci(n)*Fibonacci(k) + 1 is a prime, and -1 if no such k exists.
 * @author Georg Fischer
 */
public class A362376 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A362376() {
    super(1, new A363533(), new A000045());
  }
}

