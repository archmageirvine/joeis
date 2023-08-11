package irvine.oeis.a144;
// manually robots/triprod at 2023-08-09 22:01

import irvine.oeis.a007.A007318;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.Product;

/**
 * A144333 Triangle read by rows, A007318 * A144328
 * @author Georg Fischer
 */
public class A144333 extends Product {

  /** Construct the sequence. */
  public A144333() {
    super(1, MemorySequence.cachedSequence(new A007318()), MemorySequence.cachedSequence(new A144328()));
  }
}
