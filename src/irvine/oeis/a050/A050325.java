package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050325 Number of factorizations into squarefree factors indexed by prime signatures: A050320(A025487).
 * @author Sean A. Irvine
 */
public class A050325 extends NestedSequence {

  /** Construct the sequence. */
  public A050325() {
    super(1, new A050320(), new A025487(), 1, 1);
  }
}
