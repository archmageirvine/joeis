package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377840.
 * @author Sean A. Irvine
 */
public class A377946 extends A377573 {

  /** Construct the sequence. */
  public A377946() {
    super(GroupFactory.createGroup("C2^2:C4"), 2, 0);
  }
}

