package irvine.oeis.a064;

import irvine.oeis.NestedSequence;
import irvine.oeis.a013.A013928;
import irvine.oeis.a019.A019565;

/**
 * A064273 Permutation of nonnegative integers: a(n) = A013928(A019565(n)).
 * @author Sean A. Irvine
 */
public class A064273 extends NestedSequence {

  /** Construct the sequence. */
  public A064273() {
    super(0, new A013928(), new A019565(), 1, 0);
  }
}
