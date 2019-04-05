package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040815 Continued fraction for sqrt(845).
 * @author Georg Fischer
 */
public class A040815 extends PrependSequence {

  /** Construct the sequence. */
  public A040815() {
    super(new PeriodicSequence(14, 1, 1, 14, 58), Z.valueOf(29));
  }
}
