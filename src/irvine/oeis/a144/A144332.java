package irvine.oeis.a144;
// manually robots/triprod at 2023-08-09 22:01

import irvine.oeis.a007.A007318;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.Product;

/**
 * A144332 Triangle read by rows, A144328 * A007318.
 * @author Georg Fischer
 */
public class A144332 extends Product {

  /** Construct the sequence. */
  public A144332() {
    super(1, MemorySequence.cachedSequence(new A144328()), MemorySequence.cachedSequence(new A007318()));
  }
}
