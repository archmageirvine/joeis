package irvine.oeis.a340;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004254;
import irvine.oeis.a014.A014076;
import irvine.oeis.memory.MemorySequence;

/**
 * A340123 Odd composite integers m such that A004254(2*m-J(m,21)) == J(m,21) (mod m) and gcd(m,21)=1, where J(m,21) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A340123 extends A014076 {

  private final MemorySequence mSeq;
  private final int mMult;
  private final int mJp2;
  private final Z mMod;

  /** Construct the sequence. */
  public A340123() {
    this(1, new A004254(), 2, 21, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param seq underlying sequence
   * @param mult multiplicand
   * @param jp2 second parameter of Jacobi(,)
   * @param mod modulus
   */
  public A340123(final int offset, final Sequence seq, final int mult, final int jp2, final int mod) {
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
      final int js = LongUtils.kronecker(k, mJp2);
      final Z val = mSeq.a(mMult * k - js);
      if (val.subtract(mMod.multiply(js)).remainder(m).isZero() && Functions.GCD.l(k, mJp2) == 1) {
        return m;
      }
    }
  }
}
