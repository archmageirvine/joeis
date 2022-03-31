package irvine.oeis.a120;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A120134 a(1)=4; a(n) = floor((8 + Sum_{k=1..n-1} a(k))/2).
 * @author Georg Fischer
 */
public class A120134 extends MemorySequence {

  private int mN;
  private final int mAdd;
  private final int mDiv;

  /** Construct the sequence. */
  public A120134() {
    this(4, 8, 2);
  }

  /**
   * Generic constructor with parameters
   * @param start value of a(1)
   * @param add add this to the sum
   * @param div divisor
   */
  public A120134(final int start, final int add, final int div) {
    mN = 0;
    mAdd = add;
    mDiv = div;
    add(Z.ZERO); // a(0) does not exist
  }

  @Override
  public Z computeNext() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN - 1, k -> a(k)).add(mAdd).divide(mDiv);
  }
}
