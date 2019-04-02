package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024122 a(n) = 10^n - n^8.
 * @author Sean A. Irvine
 */
public class A024122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024122() {
    super(new long[] {-10, 91, -369, 876, -1344, 1386, -966, 444, -126, 19}, new long[] {1, 9, -156, -5561, -55536, -290625, -679616, 4235199, 83222784, 956953279});
  }
}
