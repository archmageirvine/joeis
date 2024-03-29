package irvine.oeis.a032;

import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032102 Number of dyslexic identity rooted planar trees with n nodes.
 * @author Sean A. Irvine
 */
public class A032102 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032102() {
    super(new A032101());
  }
}
