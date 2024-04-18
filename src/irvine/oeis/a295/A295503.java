package irvine.oeis.a295;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002283;

/**
 * A295503 a(n) = phi(10^n-1), where phi is Euler's totient function (A000010).
 * @author Georg Fischer
 */
public class A295503 extends AbstractSequence {

  private final A002283 mSeq1 = new A002283();

  /** Construct the sequence. */
  public A295503() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Functions.PHI.z(mSeq1.next());
  }
}
