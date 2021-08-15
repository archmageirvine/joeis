package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050348 Number of factorizations into distinct factors with 2 levels of parentheses indexed by prime signatures. A050347(A025487).
 * @author Sean A. Irvine
 */
public class A050348 extends NestedSequence {

  /** Construct the sequence. */
  public A050348() {
    super(1, new A050347(), new A025487(), 1, 1);
  }
}
