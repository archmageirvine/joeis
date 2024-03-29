package irvine.oeis.a161;
// Generated by gen_seq4.pl A161026/partcap1 at 2022-07-06 21:37

/**
 * A161103 Number of partitions of n into nonzero triangular numbers where every part appears at least 2 times.
 * @author Georg Fischer
 */
public class A161103 extends A161026 {

  /** Construct the sequence. */
  public A161103() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param appears how often every part appears
   */
  public A161103(final int offset, final int appears) {
    super(offset, appears, 1, n -> n * (n + 1) / 2);
  }
}
