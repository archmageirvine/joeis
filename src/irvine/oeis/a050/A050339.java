package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050339 Number of factorizations with 2 levels of parentheses indexed by prime signatures. A050338(A025487).
 * @author Sean A. Irvine
 */
public class A050339 extends NestedSequence {

  /** Construct the sequence. */
  public A050339() {
    super(1, new A050338(), new A025487(), 1, 1);
  }
}
