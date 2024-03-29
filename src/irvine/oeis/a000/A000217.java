package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000217 Triangular numbers: a(n) = binomial(n+1,2) = n*(n+1)/2 = 0 + 1 + 2 + ... + n.
 * @author Sean A. Irvine
 */
public class A000217 extends AbstractSequence implements DirectSequence {

  /** Construct the sequence. */
  public A000217() {
    super(0);
  }

  /**
   * Construct with different offset.
   * @param offset first index of subclass
   */
  public A000217(final int offset) {
    super(offset);
  }

  protected long mN = -1;

  /**
   * Return the nth triangular number.
   * @param n index
   * @return triangular number
   */
  public static Z triangular(final long n) {
    return Z.valueOf(n).multiply(n + 1).divide2();
  }

  /**
   * Return the index of the smallest triangular number greater than or equal to the given number.
   * @param n number to get index of
   * @return index
   */
  public static Z trinv(final Z n) {
    return n.shiftLeft(3).add(1).sqrt().subtract(1).divide2();
  }

  /**
   * Return the index of the smallest triangular number greater than or equal to the given number.
   * @param n number to get index of
   * @return index
   */
  public static long trinv(final long n) {
    return (LongUtils.sqrt(8L * n + 1) - 1) / 2;
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(n.add(1)).divide2();
  }

  @Override
  public Z a(final int n) {
    return triangular(n);
  }

  @Override
  public Z next() {
    return triangular(++mN);
  }
}

