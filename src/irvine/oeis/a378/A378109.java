package irvine.oeis.a378;

import irvine.math.group.GroupFactory;
import irvine.oeis.a377.A377573;

/**
 * A378109 Cogrowth sequence of the 18-element group S3 X C3 = &lt;S,T,U | S^3, T^2, U^3, (ST)^2, [S,U], [T,U]&gt;.
 * @author Sean A. Irvine
 */
public class A378109 extends A377573 {

  /** Construct the sequence. */
  public A378109() {
    super(GroupFactory.createGroup("C3xS3"));
  }
}

