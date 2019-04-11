package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040215 Continued fraction for <code>sqrt(231)</code>.
 * @author Georg Fischer
 */
public class A040215 extends PrependSequence {

  /** Construct the sequence. */
  public A040215() {
    super(new PeriodicSequence(5, 30), Z.valueOf(15));
  }
}
