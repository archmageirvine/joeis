package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A067112 Let N = 2357111317192329313741434753..., the concatenation of the primes; a(n) = sum of first n digits of N.
 * @author Georg Fischer
 */
public class A067112 extends PrependSequence {

  private Sequence mSeq; // underlying sequence
  private Z mSum; // current sum
  private StringBuilder mStr; // the concatenation
  private int mPos; // position in mStr

  /** Construct the sequence. */
  public A067112() {
    this(new A000040(), 0);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param inits initial terms
   */
  public A067112(final Sequence seq, final long... inits) {
    super(seq, inits);
    mSeq = seq;
    mPos = 0;
    mStr = new StringBuilder();
    mSum = Z.ZERO;
  }

  @Override
  public Z next() {
    if (mPos >= mStr.length()) {
      Z term = super.next();
      if (term.isZero() && !(mSeq instanceof A000040)) {
        term = super.next();
      }
      mStr.append(term.toString());
    }
    mSum = mSum.add(mStr.charAt(mPos++) - '0');
    return mSum;
  }
}
