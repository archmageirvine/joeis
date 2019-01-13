package irvine.oeis;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;

/**
 * Revert transform.
 * @author Sean A. Irvine
 */
public class RevertTransformSequence implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mSeq;
  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(Z.ZERO);
  }
  private int mN = 0;

  /**
   * Construct a sequence which is the revert transform of another sequence.
   * @param seq underlying sequence
   */
  public RevertTransformSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    mA.add(mSeq.next());
    return RING.reversion(RING.create(mA), ++mN).coeff(mN);
  }
}
