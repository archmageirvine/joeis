package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040383 Continued fraction for sqrt(404).
 * @author Georg Fischer
 */
public class A040383 extends PrependSequence {

  /** Construct the sequence. */
  public A040383() {
    super(new PeriodicSequence(10, 40), Z.valueOf(20));
  }
}
