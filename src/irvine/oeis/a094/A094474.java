package irvine.oeis.a094;
// manually knest/jaguar at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007689;

/**
 * A094474 a(n) is the largest prime factor of 2^n + 3^n.
 * @author Georg Fischer
 */
public class A094474 extends Sequence1 {

  private final A007689 mSeq = new A007689();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
