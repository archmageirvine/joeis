package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024675;

/**
 * A075277 Interprimes (A024675) which are of the form s*prime, s=2.
 * @author Georg Fischer
 */
public class A075277 extends AbstractSequence {

  private final Z mMult;
  private final A024675 mSeq = new A024675();

  /** Construct the sequence. */
  public A075277() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult multiplicator
   */
  public A075277(final int offset, final int mult) {
    super(offset);
    mMult = Z.valueOf(mult);
  }

  @Override
  public Z next() {
    while (true) {
      final Z term = mSeq.next();
      final Z[] quot = term.divideAndRemainder(mMult);
      if (quot[1].equals(Z.ZERO) && quot[0].isProbablePrime()) {
        return term;
      }
    }
  }
}
