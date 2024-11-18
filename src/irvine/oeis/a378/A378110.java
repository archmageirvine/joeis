package irvine.oeis.a378;

import irvine.math.group.GroupFactory;
import irvine.oeis.a377.A377573;

/**
 * A378110 Cogrowth sequence of the 18-element group S3:C3 = &lt;S,T,U | S^3, T^3, U^2, (SU)^2, (TU)^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A378110 extends A377573 {

  /** Construct the sequence. */
  public A378110() {
    super(GroupFactory.createGroup("C3:S3"));
  }
}

