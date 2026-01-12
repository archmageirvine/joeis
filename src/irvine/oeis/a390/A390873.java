package irvine.oeis.a390;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a006.A006036;
import irvine.oeis.a347.A347202;

/**
 * A390873 allocated for J. Lowell.
 * @author Sean A. Irvine
 */
public class A390873 extends IntersectionSequence {

  /** Construct the sequence. */
  public A390873() {
    super(new A347202(), new A006036());
  }
}

