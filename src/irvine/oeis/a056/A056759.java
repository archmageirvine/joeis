package irvine.oeis.a056;

import irvine.oeis.FiniteSequence;

/**
 * A056759 The 17 prime powers k = p^w such that d(p^w)^3 &gt; p^w where d = A000005().
 * @author Georg Fischer
 */
public class A056759 extends FiniteSequence {

  /** Construct the sequence. */
  public A056759() {
    super(1, FINITE, 2, 3, 4, 5, 7, 8, 9, 16, 25, 27, 32, 64, 81, 128, 256, 512, 1024);
  }
}
