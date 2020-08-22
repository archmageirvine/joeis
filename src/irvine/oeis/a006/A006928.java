package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000002;

/**
 * A006928 a(n) = length of (n+1)st run, with initial terms 1, 2.
 * @author Sean A. Irvine
 */
public class A006928 extends PrependSequence {

  /** Construct the sequence. */
  public A006928() {
    super(new SkipSequence(new A000002(), 2), Z.ONE);
  }
}
