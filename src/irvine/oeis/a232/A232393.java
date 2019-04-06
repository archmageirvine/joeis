package irvine.oeis.a232;

import irvine.oeis.FiniteSequence;

/**
 * A232393 Michael Stifel&apos;s 4 X 4 multiplication magic square read by rows.
 * @author Georg Fischer
 */
public class A232393 extends FiniteSequence {

  /** Construct the sequence. */
  public A232393() {
    super(32768, 4, 2, 4096, 256, 32, 64, 2048, 16, 512, 1024, 128, 8, 16384, 8192, 1);
  }
}
