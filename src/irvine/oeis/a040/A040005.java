package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040005 Continued fraction for sqrt(8).
 * @author Georg Fischer
 */
public class A040005 extends PrependSequence {

  /** Construct the sequence. */
  public A040005() {
    super(new PeriodicSequence(1, 4), Z.valueOf(2));
  }
}
