package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050337 Number of factorizations with one level of parentheses indexed by prime signatures. A050336(A025487).
 * @author Sean A. Irvine
 */
public class A050337 extends NestedSequence {

  /** Construct the sequence. */
  public A050337() {
    super(1, new A050336(), new A025487(), 1, 1);
  }
}
