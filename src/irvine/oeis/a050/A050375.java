package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050375 Number of ordered factorizations into composite numbers indexed by prime signatures: A050374(A025487(n)).
 * @author Sean A. Irvine
 */
public class A050375 extends NestedSequence {

  /** Construct the sequence. */
  public A050375() {
    super(1, new A050374(), new A025487(), 1, 1);
  }
}
