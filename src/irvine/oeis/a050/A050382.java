package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a008.A008480;
import irvine.oeis.a025.A025487;

/**
 * A050382 Number of ordered factorizations of n into primes by prime signature: A008480(A025487).
 * @author Sean A. Irvine
 */
public class A050382 extends NestedSequence {

  /** Construct the sequence. */
  public A050382() {
    super(1, new A008480(), new A025487(), 1, 1);
  }
}
