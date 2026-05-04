package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a024.A024619;

/**
 * A395414 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A395414 extends FilterSequence {

  /** Construct the sequence. */
  public A395414() {
    super(1, new A024619(), k -> {
      final Z sopf = Functions.SOPF.z(k);
      final Z sopfr = Functions.SOPFR.z(k);
      return !sopf.equals(sopfr) && sopfr.mod(sopf).isZero();
    });
  }
}
