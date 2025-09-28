package irvine.oeis.a307;
// manually 2025-09-28

import irvine.oeis.a002.A002033;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.RationalProductTransform;

/**
 * A307605 G.f. A(x) satisfies: A(x) = (1 + x) * A(x^2)^2*A(x^3)^3*A(x^4)^4* ... *A(x^k)^k* ...
 * @author Georg Fischer
 */
public class A307605 extends RationalProductTransform {

  private static final MemorySequence A002033 = new A002033();

  /** Construct the sequence. */
  public A307605() {
    super(0);
    this.f(k -> A002033.a(k).multiply(k).negate()).g(-1);
  }
}
