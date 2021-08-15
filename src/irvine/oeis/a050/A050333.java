package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050333 Number of factorizations into distinct numbers with an odd number of prime factors indexed by prime signatures. A050332(A025487).
 * @author Sean A. Irvine
 */
public class A050333 extends NestedSequence {

  /** Construct the sequence. */
  public A050333() {
    super(1, new A050332(), new A025487(), 1, 1);
  }
}
