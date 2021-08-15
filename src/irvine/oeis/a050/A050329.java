package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050329 Number of ordered factorizations into squarefree factors indexed by prime signatures.
 * @author Sean A. Irvine
 */
public class A050329 extends NestedSequence {

  /** Construct the sequence. */
  public A050329() {
    super(1, new A050328(), new A025487(), 0, 1);
  }
}
