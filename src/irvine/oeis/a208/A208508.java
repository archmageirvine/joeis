package irvine.oeis.a208;
// manually 2021-09-04

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A208508 Triangle of coefficients of polynomials u(n,x) jointly generated with A208509; see the Formula section.
 * @author Georg Fischer
 */
public class A208508 extends AbstractSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mVariant; // 1 = normal, 2 = add mRow to mD
  protected Polynomial<Z> mA; // factor of u(n-1)
  protected Polynomial<Z> mB; // factor of v(n-1)
  protected Polynomial<Z> mC; // constant of u(n)
  protected Polynomial<Z> mD; // factor of u(n-1)
  protected Polynomial<Z> mE; // factor of v(n-1)
  protected Polynomial<Z> mF; // constant of v(n)
  protected Polynomial<Z> mU; // current U recurrence element
  protected Polynomial<Z> mU_1; // previous U recurrence element
  protected Polynomial<Z> mV; // current V recurrence element
  protected Polynomial<Z> mV_1; // previous V recurrence element
  protected int mRow; // number of row >= 1, n in uv(n,x)
  protected int mCol; // number of column, 1 <= mCol <= mRow
  protected int mN; // current index

  /** Construct the sequence. */
  public A208508() { // for V
    // A208508  uvpolu   1   0, 1   0   1   1   1    1,x, 0, 1, 1, 1
    // A208509  uvpolv   1   0, 1   0   1   1   1    1,x, 0, 1, 1, 1
    this(1, Polynomial.create(1), Polynomial.create(0, 1), Polynomial.create(0),
        Polynomial.create(1), Polynomial.create(1), Polynomial.create(1));
  }

  /**
   * Generic constructor with parameters
   * @param variant: 1 = normal, 2 = add <code>nRow</code> to parameter d
   * @param a factor of u(n-1)
   * @param b factor of v(n-1)
   * @param c constant of u(n)
   * @param d factor of u(n-1)
   * @param e factor of v(n-1)
   * @param f constant of v(n)
   */
  public A208508(final int variant, final Polynomial<Z> a, final Polynomial<Z> b, final Polynomial<Z> c, final Polynomial<Z> d, final Polynomial<Z> e, final Polynomial<Z> f) {
    super(1);
    mVariant = variant;
    mA = a;
    mB = b;
    mC = c;
    mD = d;
    mE = e;
    mF = f;
    mN = 0;
    mRow = 0;
    mCol = 0;
    mU = Polynomial.create(1); // u(1,x) = 1
    mV = Polynomial.create(1); // v(1,x) = 1
  }

  protected void buildNextRow() {
    ++mRow;
    mCol = 0;
    if (mRow > 1) {
      mU_1 = mU;
      mV_1 = mV;
      // u(n,x)=a(n,x)*u(n-1,x)+b(n,x)*v(n-1,x)+c(n,x)
      // v(n,x)=d(n,x)*u(n-1,x)+e(n,x)*v(n-1,x)+f(n,x).
      mU = RING.add(RING.multiply(mA, mU_1), RING.add(RING.multiply(mB, mV_1), mC));
      mV = RING.add(RING.multiply((mVariant == 2) ? RING.add(Polynomial.create(mRow), mD) : mD, mU_1), RING.add(RING.multiply(mE, mV_1), mF));
    }
  }

  @Override
  public Z next() {
    ++mN;
    ++mCol;
    if (mCol > mU.degree()) {
      buildNextRow();
    }
    return mU.coeff(mCol); // U
  }
}
