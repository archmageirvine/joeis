package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040505 Continued fraction for sqrt(528).
 * @author Georg Fischer
 */
public class A040505 extends PrependSequence {

  /** Construct the sequence. */
  public A040505() {
    super(new PeriodicSequence(1, 44), Z.valueOf(22));
  }
}
