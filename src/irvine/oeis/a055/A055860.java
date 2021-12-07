package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000169;

/**
 * A055860 a(n) = A000169(n+1) if n &gt; 0; a(0) = 0.
 * @author Georg Fischer
 */
public class A055860 extends A000169 {

  protected int mN;

  /** Construct the sequence. */
  public A055860() {
    mN = -1;
    super.next();
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : super.next();
  }
}
