package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050327 Number of factorizations into distinct squarefree factors indexed by prime signatures. A050326(A025487).
 * @author Sean A. Irvine
 */
public class A050327 extends NestedSequence {

  /** Construct the sequence. */
  public A050327() {
    super(1, new A050326(), new A025487(), 1, 1);
  }
}
