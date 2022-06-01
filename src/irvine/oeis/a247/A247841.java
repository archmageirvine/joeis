package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247841 a(n) = Sum_{k=2..n} 8^k.
 * @author Sean A. Irvine
 */
public class A247841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247841() {
    super(new long[] {-8, 9}, new long[] {0, 64});
  }
}
