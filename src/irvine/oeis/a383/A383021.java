package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383021 allocated for Ois\u00edn Flynn-Connolly.
 * @author Sean A. Irvine
 */
public class A383021 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z mod = Functions.FIBONACCI.z(mN);
      final Z t = Fibonacci.fibonacci(mod.add(2), mod);
      if (Z.ONE.mod(mod).equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
