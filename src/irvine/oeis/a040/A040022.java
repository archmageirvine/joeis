package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040022 Continued fraction for sqrt(28).
 * @author Georg Fischer
 */
public class A040022 extends PrependSequence {

  /** Construct the sequence. */
  public A040022() {
    super(new PeriodicSequence(3, 2, 3, 10), Z.valueOf(5));
  }
}
