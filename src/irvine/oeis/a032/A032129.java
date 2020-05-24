package irvine.oeis.a032;

import irvine.oeis.DikTransformSequence;

/**
 * A032129 Number of dyslexic rooted planar trees with n nodes.
 * @author Sean A. Irvine
 */
public class A032129 extends DikTransformSequence {

  /** Construct the sequence. */
  public A032129() {
    super(new A032128(), 0);
  }
}
