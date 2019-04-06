package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260814 Powers of 2 with distinct digits.
 * @author Georg Fischer
 */
public class A260814 extends FiniteSequence {

  /** Construct the sequence. */
  public A260814() {
    super(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 1048576, 536870912L);
  }
}
