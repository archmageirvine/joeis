package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050335 Number of ordered factorizations into numbers with an odd number of prime factors indexed by prime signatures: A050334(A025487).
 * @author Sean A. Irvine
 */
public class A050335 extends NestedSequence {

  /** Construct the sequence. */
  public A050335() {
    super(1, new A050334(), new A025487(), 1, 1);
  }
}
