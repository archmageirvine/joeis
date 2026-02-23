package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393297 a(n) = Pell(Pell(n)) where Pell(n) = A000129(n).
 * @author Sean A. Irvine
 */
public class A393297 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.PELL.z(Functions.PELL.z(++mN));
  }
}

