package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082129 Rounded base-2 logarithm of A082128(n).
 * @author Sean A. Irvine
 */
public class A082129 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082129() {
    super(1, new A082128(), k -> CR.valueOf(k).log().divide(CR.LOG2).round());
  }
}
