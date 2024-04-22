package irvine.oeis.a104;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A104626 Numbers having three 1's in their base-phi representation.
 * @author Georg Fischer
 */
public class A104626 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n) = Lucas(2*n-4) + 1, for n>3.
    ++mN;
    if (mN <= 3) {
      return Z.valueOf(mN + 3);
    }
    return Functions.LUCAS.z(2L * mN - 4).add(1);
  }
}
