package irvine.oeis.a101;
// manually 2024-05-29/lambdan at 2024-06-01 21:52

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a010.A010060;
import irvine.oeis.memory.MemorySequence;

/**
 * A101651 a(n)=Product{k=0..n, 1+0^A010060(k)}/2.
 * @author Georg Fischer
 */
public class A101651 extends LambdaSequence {

  private static final MemorySequence A010060 = new A010060();

  /** Construct the sequence. */

  public A101651() {
    this(0, 0);
  }

  /*
   * Generic constructor with parameters
   * @param offset first index
   * @param base raise this to the power of A010060
   */
  public A101651(final int offset, final int base) {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Z.ONE.add(Z.valueOf(base).pow(A010060.a(k).intValueExact()))).divide(2));
  }
}
