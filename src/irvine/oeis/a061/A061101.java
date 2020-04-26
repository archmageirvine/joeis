package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061101 Squares with digital root 7.
 * @author Sean A. Irvine
 */
public class A061101 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A061101() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {16, 25, 169, 196, 484});
  }
}
