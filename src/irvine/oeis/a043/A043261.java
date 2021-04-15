package irvine.oeis.a043;
// manually 2021-03-01

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006995;

/**
 * A043261 Sum of the binary digits of the n-th base-2 palindrome.
 * @author Georg Fischer
 */
public class A043261 implements Sequence {

  protected int mRadix; // number system base
  protected Sequence mSeq; // underlying sequence for palindrome generation
  
  /** Construct the sequence. */
  public A043261() {
    this(new A006995(), 2);
  }

  /**
   * Generic constructor for similar sequences.
   * @param seq underlying sequence for palindrome generation
   * @param radix number system base
   */
  public A043261(final Sequence seq, final int radix) {
    mSeq = seq;
    mRadix = radix;
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(mSeq.next(), mRadix));
  }
}
