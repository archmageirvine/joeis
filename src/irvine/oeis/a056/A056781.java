package irvine.oeis.a056;

import irvine.oeis.FiniteSequence;

/**
 * A056781 Prime powers such that the 4th power of the number of divisors is not smaller than the number itself.
 * @author Georg Fischer
 */
public class A056781 extends FiniteSequence {

  /** Construct the sequence. */
  public A056781() {
    super(2, 3, 4, 5, 7, 8, 9, 11, 13, 16, 25, 27, 32, 49, 64, 81, 125, 128, 243, 256, 512, 625, 729, 1024, 2048, 2187, 4096, 6561, 8192, 16384, 32768, 65536);
  }
}
