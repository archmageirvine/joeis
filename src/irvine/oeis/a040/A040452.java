package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040452 Continued fraction for sqrt(474).
 * @author Georg Fischer
 */
public class A040452 extends PrependSequence {

  /** Construct the sequence. */
  public A040452() {
    super(new PeriodicSequence(1, 3, 2, 1, 1, 1, 6, 1, 1, 1, 2, 3, 1, 42), Z.valueOf(21));
  }
}
