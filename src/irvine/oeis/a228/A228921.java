package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228921 Number of solutions to Sum(x_i^2, i=1...n) <code>== 0 (mod 8)</code>.
 * @author Sean A. Irvine
 */
public class A228921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228921() {
    super(new long[] {65536, -24576, 4096, -256, 256, -96, 16}, new long[] {2, 8, 32, 128, 3072, 32768, 294912});
  }
}
