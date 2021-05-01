package irvine.oeis;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Revert transform.
 * @author Sean A. Irvine
 */
public class RevertTransformSequence implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected final Sequence mSeq;
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());
  {
    mA.add(Z.ZERO);
  }

  /**
   * Construct a sequence which is the revert transform of another sequence.
   * @param seq underlying sequence
   */
  public RevertTransformSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    final int n = mA.size();
    mA.add(mSeq.next());
    return RING.reversion(mA, n).coeff(n);
  }
}
