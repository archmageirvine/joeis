package irvine.oeis.a258;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A258293 Number of partitions of 3*n^2 into parts that are at most n.
 * @author Georg Fischer
 */
public class A258293 extends MemoryFunction2Sequence<Z, Z> {

  private int mN; // current index
  private final Z mA0; // value of a(0)
  private final Function<Integer, Z> mLambda;

  /** Construct the sequence. */
  public A258293() {
    this(0, 1, n -> Z.valueOf(n).square().multiply(3));
  }

  /**
   * Generic constructor with parameter.
   * @param a0 value of a(0): 0 or 1.
   * @param lambda expression for number to be partitioned
   */
  public A258293(final int offset, int a0, Function<Integer, Z> lambda) {
    super(offset);
    mN = offset - 1;
    mA0 = Z.valueOf(a0);
    mLambda = lambda;
  }

  @Override
  protected Z compute(final Z n, final Z k) {
    if (n.isZero() || k.compareTo(Z.ONE) <= 0) {
      return Z.ONE;
    }
    Z result = get(n, k.subtract(1));
    if (n.compareTo(k) >= 0) {
      result = result.add(get(n.subtract(k), k));
    }
    return result;
  }

  @Override
  public Z next() {
    return ++mN == 0 ? mA0 : get(mLambda.apply(mN), Z.valueOf(mN));
  }
}
