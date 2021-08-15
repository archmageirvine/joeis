package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a001.A001055;
import irvine.oeis.a025.A025487;

/**
 * A050322 Number of factorizations indexed by prime signatures: A001055(A025487).
 * @author Sean A. Irvine
 */
public class A050322 extends NestedSequence {

  /** Construct the sequence. */
  public A050322() {
    super(1, new A001055(), new A025487(), 1, 1);
  }
}
