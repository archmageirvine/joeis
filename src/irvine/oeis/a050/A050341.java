package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050341 Number of factorizations with 3 levels of parentheses indexed by prime signatures. A050340(A025487).
 * @author Sean A. Irvine
 */
public class A050341 extends NestedSequence {

  /** Construct the sequence. */
  public A050341() {
    super(1, new A050340(), new A025487(), 1, 1);
  }
}
