package irvine.oeis.a033;
// manually 2021-07-21

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A033308 Decimal expansion of Copeland-Erd\u0151s constant: concatenate primes.
 * @author Georg Fischer
 */
public class A033308 implements Sequence {

  protected String mS;
  protected int mPos;
  protected Sequence mSeq;
  protected int mBase;
  
  /** Construct the sequence. */
  public A033308() {
    this(new A000040(), 10);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence which is concatenated
   * @param base digits in this number base &lt;= 36
   */
  public A033308(final Sequence seq, final int base) {
    mSeq = seq;
    mBase = base;
    mPos = 0;
    mS = "";
  }

  /**
   * Generic constructor with parameter and default base 10
   * @param seq underlying sequence which is concatenated
   */
  public A033308(final Sequence seq) {
    this(seq, 10);
  }

  @Override
  public Z next() {
    if (++mPos >= mS.length()) {
      mS = mSeq.next().toString(mBase);
      mPos = 0;
    }
    final char c = mS.charAt(mPos);
    return Z.valueOf(c - (c <= '9' ? '0' : 'a'));
  }
}
