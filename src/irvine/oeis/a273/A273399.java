package irvine.oeis.a273;

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000108;

/**
 * A273399 a(n) = Catalan(Catalan(n)).
 * @author Georg Fischer
 */
public class A273399 extends NestedSequence {

  /** Construct the sequence. */
  public A273399() {
    super(0, new A000108(), new A000108(), 0, 0);
  }
}
