package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040460 Continued fraction for <code>sqrt(482)</code>.
 * @author Georg Fischer
 */
public class A040460 extends PrependSequence {

  /** Construct the sequence. */
  public A040460() {
    super(new PeriodicSequence(1, 20, 1, 42), Z.valueOf(21));
  }
}
