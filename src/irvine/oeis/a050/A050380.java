package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050380 Number of ordered factorizations into members of A050376 by prime signature. A050379(A025487).
 * @author Sean A. Irvine
 */
public class A050380 extends NestedSequence {

  /** Construct the sequence. */
  public A050380() {
    super(1, new A050379(), new A025487(), 1, 1);
  }
}
