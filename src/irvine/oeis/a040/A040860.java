package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040860 Continued fraction for sqrt(890).
 * @author Georg Fischer
 */
public class A040860 extends PrependSequence {

  /** Construct the sequence. */
  public A040860() {
    super(new PeriodicSequence(1, 4, 1, 58), Z.valueOf(29));
  }
}
