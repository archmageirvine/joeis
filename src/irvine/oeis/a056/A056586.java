package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056586 Ninth power of Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A056586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056586() {
    super(new long[] {1, 55, -1870, -19635, 85085, 136136, -85085, -19635, 1870, 55}, new long[] {0, 1, 1, 512, 19683, 1953125, 134217728, 10604499373L, 794280046581L, 60716992766464L});
  }
}
