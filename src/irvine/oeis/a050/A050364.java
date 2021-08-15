package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050364 Number of ordered factorizations into prime powers &gt;1 indexed by prime signatures. A050363(A025487).
 * @author Sean A. Irvine
 */
public class A050364 extends NestedSequence {

  /** Construct the sequence. */
  public A050364() {
    super(1, new A050363(), new A025487(), 1, 1);
  }
}
