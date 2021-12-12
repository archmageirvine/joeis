package irvine.oeis.a033;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a006.A006820;

/**
 * A033301 Number of 4-valent (or quartic) graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033301 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A033301() {
    super(new A006820(), 1);
  }
}
