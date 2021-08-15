package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050350 Number of factorizations into distinct factors with 3 levels of parentheses indexed by prime signatures. A050349(A025487).
 * @author Sean A. Irvine
 */
public class A050350 extends NestedSequence {

  /** Construct the sequence. */
  public A050350() {
    super(1, new A050349(), new A025487(), 1, 1);
  }
}
