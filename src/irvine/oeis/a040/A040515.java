package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040515 Continued fraction for sqrt(539).
 * @author Georg Fischer
 */
public class A040515 extends PrependSequence {

  /** Construct the sequence. */
  public A040515() {
    super(new PeriodicSequence(4, 1, 1, 1, 1, 1, 4, 46), Z.valueOf(23));
  }
}
