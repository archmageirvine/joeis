package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050373 Number of factorizations into distinct composite numbers indexed by prime signatures.
 * @author Sean A. Irvine
 */
public class A050373 extends NestedSequence {

  /** Construct the sequence. */
  public A050373() {
    super(1, new A050372(), new A025487(), 1, 1);
  }
}
