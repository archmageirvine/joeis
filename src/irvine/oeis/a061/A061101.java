package irvine.oeis.a061;

import irvine.oeis.Conjectural;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A061101 Squares with digital root 7.
 * @author Sean A. Irvine
 */
public class A061101 extends LinearRecurrence implements Conjectural {

  /** Construct the sequence. */
  public A061101() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {16, 25, 169, 196, 484});
  }
}
