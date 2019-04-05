package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040937 Continued fraction for sqrt(969).
 * @author Georg Fischer
 */
public class A040937 extends PrependSequence {

  /** Construct the sequence. */
  public A040937() {
    super(new PeriodicSequence(7, 1, 3, 3, 1, 1, 1, 2, 1, 1, 1, 3, 3, 1, 7, 62), Z.valueOf(31));
  }
}
