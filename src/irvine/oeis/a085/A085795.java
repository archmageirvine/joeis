package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085795 Dimensions k such that the (2,k)-cross lattice-tiles R^k.
 * @author Sean A. Irvine
 */
public class A085795 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085795() {
    super(1, k -> {
      for (final Z p : Jaguar.factor(4L * k + 1).toZArray()) {
        if (Functions.ORDER.z(p, 4).isOdd()) {
          return false;
        }
      }
      return true;
    });
  }
}
