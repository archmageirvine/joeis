package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050331 Number of factorizations into numbers with an odd number of prime factors indexed by prime signatures. A050330(A025487).
 * @author Sean A. Irvine
 */
public class A050331 extends NestedSequence {

  /** Construct the sequence. */
  public A050331() {
    super(1, new A050330(), new A025487(), 1, 1);
  }
}
