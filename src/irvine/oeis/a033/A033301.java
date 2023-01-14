package irvine.oeis.a033;

import irvine.oeis.SkipSequence;
import irvine.oeis.a006.A006820;
import irvine.oeis.transform.EulerTransform;

/**
 * A033301 Number of 4-valent (or quartic) graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033301 extends EulerTransform {

  /** Construct the sequence. */
  public A033301() {
    super(0, new SkipSequence(new A006820(), 1), 1);
  }
}
