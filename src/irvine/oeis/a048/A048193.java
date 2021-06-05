package irvine.oeis.a048;

import irvine.oeis.EulerTransform;

/**
 * A048193 Number of chordal graphs (or triangulated graphs) on n vertices.
 * @author Sean A. Irvine
 */
public class A048193 extends EulerTransform {

  /** Construct the sequence. */
  public A048193() {
    super(new A048192());
  }
}

