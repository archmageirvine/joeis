package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;
import irvine.oeis.a074.A074206;

/**
 * A050324 Number of ordered factorizations indexed by prime signatures: A074206(A025487).
 * @author Sean A. Irvine
 */
public class A050324 extends NestedSequence {

  /** Construct the sequence. */
  public A050324() {
    super(1, new A074206(), new A025487(), 0, 1);
  }
}
