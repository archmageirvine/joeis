package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040824 Continued fraction for sqrt(854).
 * @author Georg Fischer
 */
public class A040824 extends PrependSequence {

  /** Construct the sequence. */
  public A040824() {
    super(new PeriodicSequence(4, 2, 11, 4, 11, 2, 4, 58), Z.valueOf(29));
  }
}
