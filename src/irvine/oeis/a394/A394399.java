package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014574;

/**
 * A394399 allocated for Aied Sulaiman.
 * @author Sean A. Irvine
 */
public class A394399 extends FilterSequence {

  /** Construct the sequence. */
  public A394399() {
    super(1, new A014574(), k -> Functions.GCD.z(k, Functions.SIGMA1.z(k)).equals(Z.THREE));
  }
}
