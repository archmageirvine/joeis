package irvine.oeis.a128;
// manually triprod at 2023-06-06 09:14

import irvine.math.z.Z;
import irvine.oeis.a054.A054525;
import irvine.oeis.a129.A129691;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.Product;

/**
 * A128980 A054525 * A129691(unsigned).
 * @author Georg Fischer
 */
public class A128980 extends Product {

  /** Construct the sequence. */
  public A128980() {
    super(1, new A054525(), MemorySequence.cachedSequence(new A129691() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    }));
  }
}
