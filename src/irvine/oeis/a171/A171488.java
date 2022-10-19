package irvine.oeis.a171;

import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005773;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A171488 Riordan array (f(x), x*f(x)) where f(x) is the g.f. of A005773(n+1)= 1,2,5,13,35,96,267,...
 * @author Georg Fischer
 */
public class A171488 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A171488() {
    super(0, new SkipSequence(new A005773(), 1));
  }
}
