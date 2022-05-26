package irvine.oeis.a246;
// manually inverse at 2022-05-26 20:28

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a048.A048672;

/**
 * A246353 If n = Sum 2^e_i, e_i distinct, then a(n) = Position of (product prime_{e_i+1}) among squarefree numbers (A005117).
 * @author Georg Fischer
 */
public class A246353 extends InverseSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A246353() {
    super(new A048672(), 1, 1);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return super.next();
  }
}
