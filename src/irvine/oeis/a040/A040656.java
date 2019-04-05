package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040656 Continued fraction for sqrt(683).
 * @author Georg Fischer
 */
public class A040656 extends PrependSequence {

  /** Construct the sequence. */
  public A040656() {
    super(new PeriodicSequence(7, 2, 4, 3, 1, 1, 25, 1, 1, 3, 4, 2, 7, 52), Z.valueOf(26));
  }
}
