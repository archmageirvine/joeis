package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229138 Number of solutions to Sum_{i=1...n} x_i^2 == 1 (mod 8) with x_i in 0..7.
 * @author Sean A. Irvine
 */
public class A229138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229138() {
    super(new long[] {65536, -24576, 4096, -256, 256, -96, 16}, new long[] {4, 16, 96, 512, 2560, 24576, 229376});
  }
}
