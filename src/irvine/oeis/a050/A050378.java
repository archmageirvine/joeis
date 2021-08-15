package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050378 Number of factorizations into members of A050376 by prime signature. A050377(A025487).
 * @author Sean A. Irvine
 */
public class A050378 extends NestedSequence {

  /** Construct the sequence. */
  public A050378() {
    super(1, new A050377(), new A025487(), 1, 1);
  }
}
