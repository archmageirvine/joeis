package irvine.oeis.a103;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A103167 a(n) = 2^n mod reverse(2^n).
 * @author Georg Fischer
 */
public class A103167 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A103167() {
    mN = 0;
  }

  @Override
  public Z next() {
    final Z n2 = Z.ONE.shiftLeft(++mN);
    return n2.mod(Functions.REVERSE.z(n2));
  }
}
