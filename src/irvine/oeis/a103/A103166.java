package irvine.oeis.a103;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A103166 a(n) = reverse(2^n) mod 2^n.
 * @author Georg Fischer
 */
public class A103166 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A103166() {
    mN = 0;
  }

  @Override
  public Z next() {
    final Z n2 = Z.ONE.shiftLeft(++mN);
    return Functions.REVERSE.z(n2).mod(n2);
  }
}
