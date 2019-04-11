package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040506 Continued fraction for <code>sqrt(530)</code>.
 * @author Georg Fischer
 */
public class A040506 extends PrependSequence {

  /** Construct the sequence. */
  public A040506() {
    super(new PeriodicSequence(46), Z.valueOf(23));
  }
}
