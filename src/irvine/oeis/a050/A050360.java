package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000688;
import irvine.oeis.a025.A025487;

/**
 * A050360 Abelian groups (factorizations into prime powers &gt;1) indexed by prime signatures. A000688(A025487).
 * @author Sean A. Irvine
 */
public class A050360 extends NestedSequence {

  /** Construct the sequence. */
  public A050360() {
    super(1, new A000688(), new A025487(), 1, 1);
  }
}
