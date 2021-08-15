package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050346 Number of factorizations into distinct factors with one level of parentheses indexed by prime signatures. A050345(A025487).
 * @author Sean A. Irvine
 */
public class A050346 extends NestedSequence {

  /** Construct the sequence. */
  public A050346() {
    super(1, new A050345(), new A025487(), 1, 1);
  }
}
