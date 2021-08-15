package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050371 Number of factorizations into composite numbers indexed by prime signatures. A050370(A025487).
 * @author Sean A. Irvine
 */
public class A050371 extends NestedSequence {

  /** Construct the sequence. */
  public A050371() {
    super(1, new A050370(), new A025487(), 1, 1);
  }
}
