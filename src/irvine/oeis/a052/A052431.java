package irvine.oeis.a052;

import irvine.oeis.EulerTransform;

/**
 * A052431 Number of perfect simple undirected graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A052431 extends EulerTransform {

  /** Construct the sequence. */
  public A052431() {
    super(new A052433(), 0);
    next();
  }
}

