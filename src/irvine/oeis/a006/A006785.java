package irvine.oeis.a006;

import irvine.oeis.a024.A024607;
import irvine.oeis.transform.EulerTransform;

/**
 * A006785 Number of triangle-free graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A006785 extends EulerTransform {

  /** Construct the sequence. */
  public A006785() {
    super(1, new A024607());
  }
}
