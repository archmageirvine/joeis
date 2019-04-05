package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040314 Continued fraction for sqrt(333).
 * @author Georg Fischer
 */
public class A040314 extends PrependSequence {

  /** Construct the sequence. */
  public A040314() {
    super(new PeriodicSequence(4, 36), Z.valueOf(18));
  }
}
