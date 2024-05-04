package irvine.oeis.a361;
// manually knest at 2023-06-02 20:44

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000292;

/**
 * A361671 Squarefree part of the n-th tetrahedral number.
 * @author Georg Fischer
 */
public class A361671 extends A000292 {

  /** Construct the sequence. */
  public A361671() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.CORE.z(super.next());
  }
}
