package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040139 Continued fraction for sqrt(152).
 * @author Georg Fischer
 */
public class A040139 extends PrependSequence {

  /** Construct the sequence. */
  public A040139() {
    super(new PeriodicSequence(3, 24), Z.valueOf(12));
  }
}
