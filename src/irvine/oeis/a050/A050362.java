package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050362 Number of factorizations into distinct prime powers &gt;1 indexed by prime signatures.
 * @author Sean A. Irvine
 */
public class A050362 extends NestedSequence {

  /** Construct the sequence. */
  public A050362() {
    super(1, new A050361(), new A025487(), 1, 1);
  }
}
