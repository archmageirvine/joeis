package irvine.oeis.a339;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003501;
import irvine.oeis.a014.A014076;
import irvine.oeis.memory.MemorySequence;

/**
 * A339130 Odd composite integers m such that A003501(m-J(m,21)) == 2 (mod m) and gcd(m,21)=1, where J(m,21) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A339130 extends A014076 {

  private final MemorySequence mSeq;
  private final int mMult;
  private final int mJp2;
  private final Z mMod;

  /** Construct the sequence. */
  public A339130() {
    this(1, new A003501(), 1, 21, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param seq underlying sequence
   * @param mult multiplicand
   * @param jp2 second parameter of Jacobi(,)
   * @param mod modulus
   */
  public A339130(final int offset, final Sequence seq, final int mult, final int jp2, final int mod) {
    super.next(); // skip 1
    setOffset(offset);
    mSeq = MemorySequence.cachedSequence(seq);
    mMult = mult;
    mJp2 = jp2;
    mMod = Z.valueOf(mod);
  }

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next();
      final int k = m.intValueExact();
      final Z val = mSeq.a(mMult * k - LongUtils.kronecker(k, mJp2));
      if (val.subtract(mMod).remainder(m).isZero() && LongUtils.gcd(k, mJp2) == 1) {
        return m;
      }
    }
  }
}
