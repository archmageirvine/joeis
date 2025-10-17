package irvine.oeis.a386;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a025.A025487;
import irvine.oeis.a332.A332785;

/**
 * A386223 Nonsquarefree weak numbers k that are products of primorials.
 * @author Sean A. Irvine
 */
public class A386223 extends IntersectionSequence {

  /** Construct the sequence. */
  public A386223() {
    super(1, new A025487(), new A332785());
  }
}
