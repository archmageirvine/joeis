package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040877 Continued fraction for sqrt(908).
 * @author Georg Fischer
 */
public class A040877 extends PrependSequence {

  /** Construct the sequence. */
  public A040877() {
    super(new PeriodicSequence(7, 1, 1, 14, 1, 1, 7, 60), Z.valueOf(30));
  }
}
