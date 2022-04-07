package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008284;

/**
 * A055888 Invert transform of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A055888 implements Sequence {

  private static final PolynomialRingField<Z> RING_Y = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>(RING_Y);
  private final Sequence mSeq;
  private final Polynomial<Polynomial<Z>> mA = RING.empty(); // 2-d g.f. to be inverted
  {
    mA.add(Polynomial.create(1));
  }
  private Polynomial<Polynomial<Z>> mGf = null; // INVERT transform of mA
  private int mN = -1;
  private int mM = 0;

  protected A055888(final Sequence under) {
    mSeq = under;
  }

  /** Construct the sequence. */
  public A055888() {
    this(new A008284());
    next();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      // Update 2-d polynomial of underlying triangle
      final Polynomial<Z> row = RING_Y.empty();
      row.add(Z.ZERO);
      for (int k = 0; k <= mN; ++k) {
        row.add(mSeq.next().negate());
      }
      mA.add(row);
      // INVERT transform
      mGf = RING.series(RING.one(), mA, mN);
      //System.out.println("a:" + mA);
      //System.out.println("g:" + mGf);
    }
    return mGf.coeff(mN).coeff(mM);
  }
}
