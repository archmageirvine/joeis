package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040540 Continued fraction for sqrt(564).
 * @author Georg Fischer
 */
public class A040540 extends PrependSequence {

  /** Construct the sequence. */
  public A040540() {
    super(new PeriodicSequence(1, 2, 1, 46), Z.valueOf(23));
  }
}
