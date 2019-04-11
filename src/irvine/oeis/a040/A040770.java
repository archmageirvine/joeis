package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040770 Continued fraction for <code>sqrt(799)</code>.
 * @author Georg Fischer
 */
public class A040770 extends PrependSequence {

  /** Construct the sequence. */
  public A040770() {
    super(new PeriodicSequence(3, 1, 3, 56), Z.valueOf(28));
  }
}
