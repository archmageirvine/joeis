package irvine.oeis.a051;
// manually 2024-07-23

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003422;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051403 a(n) = (n+2)*(a(n-1) - a(n-2)).
 * @author Georg Fischer
 */
public class A051403 extends HolonomicRecurrence implements DirectSequence {

  private static final DirectSequence A003422 = new A003422();
  
  /** Construct the sequence. */
  public A051403() {
    super(-1, "[[0],[0, 2, 1],[0,-2,-1],[0, 1]]", "0, 1, 3, 8, 25", 0);
  }

  @Override
  public Z a(final Z n) {
    // a(n) = (n+2)* A003422(n+1) /2
    return A003422.a(n.add(1)).multiply(n.add(2)).divide2();
  }

  @Override
  public Z a(final int n) {
    return A003422.a(n + 1).multiply(n + 2).divide2();
  }

}
