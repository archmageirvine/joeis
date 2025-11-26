package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082128.
 * @author Sean A. Irvine
 */
public class A082129 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082129() {
    super(0, new A082128(), k -> CR.valueOf(k).log().divide(CR.LOG2).round());
  }
}
