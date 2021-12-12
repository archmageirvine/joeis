package irvine.oeis.a006;

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a024.A024607;

/**
 * A006785 Number of triangle-free graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A006785 extends EulerTransform {

  /** Construct the sequence. */
  public A006785() {
    super(new A024607());
  }
}
