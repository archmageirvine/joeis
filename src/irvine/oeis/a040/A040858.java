package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040858 Continued fraction for sqrt(888).
 * @author Georg Fischer
 */
public class A040858 extends PrependSequence {

  /** Construct the sequence. */
  public A040858() {
    super(new PeriodicSequence(1, 3, 1, 58), Z.valueOf(29));
  }
}
