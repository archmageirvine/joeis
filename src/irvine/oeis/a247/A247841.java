package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247841 <code>Sum(8^k, k=2..n)</code>.
 * @author Sean A. Irvine
 */
public class A247841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247841() {
    super(new long[] {-8, 9}, new long[] {0, 64});
  }
}
