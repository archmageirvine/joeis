package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040007 Continued fraction for <code>sqrt(11)</code>.
 * @author Georg Fischer
 */
public class A040007 extends PrependSequence {

  /** Construct the sequence. */
  public A040007() {
    super(new PeriodicSequence(3, 6), Z.THREE);
  }
}
