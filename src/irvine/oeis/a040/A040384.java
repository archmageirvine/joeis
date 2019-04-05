package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040384 Continued fraction for sqrt(405).
 * @author Georg Fischer
 */
public class A040384 extends PrependSequence {

  /** Construct the sequence. */
  public A040384() {
    super(new PeriodicSequence(8, 40), Z.valueOf(20));
  }
}
