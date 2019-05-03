package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260387 Numbers <code>n = d_0d_1...d_n (n &lt; 10)</code> such that <code>d_i</code> is the number of digits equal to i in <code>n</code> (base <code>b)</code>, where b is less than 10.
 * @author Georg Fischer
 */
public class A260387 extends FiniteSequence {

  /** Construct the sequence. */
  public A260387() {
    super(12, 13, 320, 3201, 72200, 89000, 132110, 345000, 643000, 2320200, 3121300, 10103111, 11300130, 42430000, 51340000, 64030000, 72300000, 86300000, 125102000L, 130213000L, 211220001L, 220101111L, 323111000L, 431130000L, 614110000L, 667000000L, 2153100000L, 2521002000L, 3021211100L);
  }
}
