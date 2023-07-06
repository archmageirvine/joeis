package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050355 Ordered factorizations with one level of parentheses indexed by prime signatures. A050354(A025487).
 * @author Sean A. Irvine
 */
public class A050355 extends NestedSequence {

  /** Construct the sequence. */
  public A050355() {
    super(1, new A050354(), new A025487(), 1, 1);
  }
}
