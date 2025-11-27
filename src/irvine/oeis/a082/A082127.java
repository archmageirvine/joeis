package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082127 Rounded base-3 logarithm of A082126(n).
 * @author Sean A. Irvine
 */
public class A082127 extends SimpleTransformSequence {

  private static final CR LOG3 = CR.THREE.log();

  /** Construct the sequence. */
  public A082127() {
    super(0, new A082126(), k -> CR.valueOf(k).log().divide(LOG3).round());
  }
}
