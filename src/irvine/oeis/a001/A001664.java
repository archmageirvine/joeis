package irvine.oeis.a001;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001664 Quadratic coefficient of the n-th converging polynomial of Weber functions.
 * @author Sean A. Irvine
 */
public class A001664 extends AbstractSequence {

  private int mN = 1;

  protected A001664(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001664() {
    this(2);
  }

  private Z prs(final int r, final int s) {
    switch (r) {
      case 0:
        return s == 0 ? Z.ONE : Z.ZERO;
      case 1:
        if (s == 0) {
          return Z.NEG_ONE;
        }
        if (s == 1) {
          return Z.ONE;
        }
        return Z.ZERO;
      case 2:
        if (s == 0) {
          return Z.ONE;
        }
        if (s == 1) {
          return Z.THREE.negate();
        }
        if (s == 2) {
          return Z.ONE;
        }
        return Z.ZERO;
      default:
        throw new IllegalArgumentException();
    }
  }
  
  protected MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int r, final int s) {
      if (r == s) {
        return Z.ONE;
      }
      if (s > r || s < 0) {
        return Z.ZERO;
      }
      if (r <= 2) {
        return prs(r, s);
      }
      if (s == 0) {
        return get(r, 1).multiply(6)
          .subtract(get(r, 2).multiply(8))
          .add(get(r - 1, 1).multiply(16L * r - 4))
          .add(get(r - 1, 0).multiply(-12L * r))
          .subtract(get(r - 2, 0).multiply(16L * (r - 1) * (r - 1) + 8L * (r - 1)))
          .divide2();
      } else if (s == 1) {
        return get(r, 2).multiply(12)
          .subtract(get(r, 3).multiply(24))
          .add(get(r - 1, 2).multiply(32L * r - 8))
          .subtract(get(r - 1, 1).multiply(8))
          .add(get(r - 1, 0).multiply(6))
          .add(get(r - 1, 1).multiply(-12L * r))
          .add(get(r - 2, 0).multiply(16L * r - 12))
          .subtract(get(r - 2, 1).multiply(
            8L * (r - 1) + 16L * (r - 1) * (r - 1)))
          .divide2();
      } else if (s == r - 1) {
        return get(r, r).multiply(6L * r)
          .subtract(get(r - 1, r - 1).multiply(8L * (r - 1)))
          .add(get(r - 1, r - 2).multiply(6))
          .add(get(r - 1, r - 1).multiply(-12L * r))
          .subtract(get(r - 2, r - 3).multiply(4))
          .add(get(r - 2, r - 2).multiply(16L * r - 12))
          .divide2();
      } else {
        return get(r, s + 1).multiply(6L * (s + 1))
          .subtract(get(r, s + 2).multiply(4L * (s + 1) * (s + 2)))
          .add(get(r - 1, s + 1).multiply((16L * r - 4) * (s + 1)))
          .subtract(get(r - 1, s).multiply(8L * s))
          .add(get(r - 1, s - 1).multiply(6))
          .add(get(r - 1, s).multiply(-12L * r))
          .subtract(get(r - 2, s - 2).multiply(4))
          .add(get(r - 2, s - 1).multiply(16L * r - 12))
          .subtract(get(r - 2, s).multiply(16L * (r - 1) * (r - 1) + 8L * (r - 1)))
          .divide2();
      }
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 2);
  }
}
