package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000002;

/**
 * A006928 <code>a(n) =</code> length of <code>(n+1)st</code> run, with initial terms <code>1, 2</code>.
 * @author Sean A. Irvine
 */
public class A006928 extends PrependSequence {

  /** Construct the sequence. */
  public A006928() {
    super(new SkipSequence(new A000002(), 2), Z.ONE);
  }
}
