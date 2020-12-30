package irvine.oeis.a024;

import irvine.oeis.InverseEulerTransform;
import irvine.oeis.a006.A006785;

/**
 * A024607 Number of connected triangle-free graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A024607 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A024607() {
    super(new A006785(), 0);
    next();
  }
}
