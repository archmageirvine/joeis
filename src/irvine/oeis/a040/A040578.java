package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040578 Continued fraction for sqrt(603).
 * @author Georg Fischer
 */
public class A040578 extends PrependSequence {

  /** Construct the sequence. */
  public A040578() {
    super(new PeriodicSequence(1, 1, 3, 1, 23, 1, 3, 1, 1, 48), Z.valueOf(24));
  }
}
