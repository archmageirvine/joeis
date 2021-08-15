package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;
import irvine.oeis.a045.A045778;

/**
 * A050323 Number of factorizations into distinct factors indexed by prime signatures: A045778(A025487).
 * @author Sean A. Irvine
 */
public class A050323 extends NestedSequence {

  /** Construct the sequence. */
  public A050323() {
    super(1, new A045778(), new A025487(), 1, 1);
  }
}
