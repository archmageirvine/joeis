package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091870 A trinomial transform of <code>Fibonacci(3n)</code>.
 * @author Sean A. Irvine
 */
public class A091870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091870() {
    super(new long[] {-11, 8}, new long[] {0, 1});
  }
}
