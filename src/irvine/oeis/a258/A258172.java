package irvine.oeis.a258;

import java.util.function.BiFunction;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A258172 Sum over all Dyck paths of semilength n of products over all peaks p of x_p, where x_p is the x-coordinate of peak p.
 * @author Georg Fischer
 */
public class A258172 extends AbstractSequence implements DirectSequence {

  private int mN; // current index
  private final BiFunction<Integer, Integer, Z> mLambda; // (x, y) -> f(x, y)

  /** Construct the sequence. */
  public A258172() {
    this(0, (x, y) -> Z.valueOf(x));
  }

  /**
   * Generic constructor with parameter.
   * @param lambda take peaks of this expression
   */
  public A258172(final int offset, final BiFunction<Integer, Integer, Z> lambda) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
  }

  /* Maple:
    b:= proc(x, y, t) option remember; `if`(y>x or y<0, 0,
          `if`(x=0, 1, b(x-1, y-1, false)*`if`(t, x, 1) +
                       b(x-1, y+1, true)  ))
        end:
    a:= n-> b(2*n, 0, false):
    seq(a(n), n=0..20);
  */
  private final MemoryFunctionInt3<Z> mF = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int x, final int y, final int t) {
      if (y > x || y < 0) {
        return Z.ZERO;
      }
      if (x == 0) {
        return Z.ONE;
      }
      return get(x - 1, y - 1, 0).multiply((t == 1) ? mLambda.apply(x, y) : Z.ONE).add(get(x - 1, y + 1, 1));
    }
  };

  @Override
  public Z a(final int n) {
    return mF.get(2 * n, 0, 0);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
