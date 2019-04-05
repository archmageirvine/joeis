package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040120 Continued fraction for sqrt(132).
 * @author Georg Fischer
 */
public class A040120 extends PrependSequence {

  /** Construct the sequence. */
  public A040120() {
    super(new PeriodicSequence(2, 22), Z.valueOf(11));
  }
}
