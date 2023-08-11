package irvine.oeis.a130;
// manually robots/triprod at 2023-08-09

import irvine.oeis.a007.A007318;
import irvine.oeis.a090.A090181;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.Product;

/**
 * A130749 Triangle A007318*A090181 (as infinite lower triangular matrices) .
 * @author Georg Fischer
 */
public class A130749 extends Product {

  /** Construct the sequence. */
  public A130749() {
    super(0, MemorySequence.cachedSequence(new A007318()), MemorySequence.cachedSequence(new A090181()));
  }
}
