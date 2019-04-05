package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040213 Continued fraction for sqrt(229).
 * @author Georg Fischer
 */
public class A040213 extends PrependSequence {

  /** Construct the sequence. */
  public A040213() {
    super(new PeriodicSequence(7, 1, 1, 7, 30), Z.valueOf(15));
  }
}
