package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000265;

/**
 * A025480 a(2n) = n, a(2n+1) = a(n).
 * @author Sean A. Irvine
 */
public class A025480 extends A000265 implements DirectSequence {

  /** Construct the sequence. */
  public A025480() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }

  @Override
  public Z a(final Z n) {
    // a(n) = (A000265(n+1)-1)/2
    return Functions.MAKE_ODD.z(n.add(1)).subtract(1).divide2();
  }

  @Override
  public Z a(final int n) {
    return Functions.MAKE_ODD.z(n + 1).subtract(1).divide2();
  }

}

