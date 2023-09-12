package irvine.oeis.a161;
// manually A161026/partcap2 at 2022-07-06 21:37

import irvine.oeis.a006.A006720;
import irvine.oeis.memory.MemorySequence;

/**
 * A161306 Number of partitions of n into Somos-4 sequence numbers A006720.
 * @author Georg Fischer
 */
public class A161306 extends A161026 {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A006720().skip(3));

  /** Construct the sequence. */
  public A161306() {
    super(1, 1, 0, null);
    mLambda = n -> mSeq.a(n).intValue();
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param appears how often every part appears
   */
  public A161306(final int offset, final int appears) {
    super(offset, appears, 0, null);
    mLambda = n -> mSeq.a(n).intValue();
  }
}
