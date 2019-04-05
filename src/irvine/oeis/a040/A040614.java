package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040614 Continued fraction for sqrt(640).
 * @author Georg Fischer
 */
public class A040614 extends PrependSequence {

  /** Construct the sequence. */
  public A040614() {
    super(new PeriodicSequence(3, 2, 1, 4, 1, 11, 1, 4, 1, 2, 3, 50), Z.valueOf(25));
  }
}
