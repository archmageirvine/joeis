package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040015 Continued fraction for sqrt(20).
 * @author Georg Fischer
 */
public class A040015 extends PrependSequence {

  /** Construct the sequence. */
  public A040015() {
    super(new PeriodicSequence(2, 8), Z.valueOf(4));
  }
}
