package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377946 Cogrowth sequence of the 16-element group C2^2:C4 = &lt;S,T | S^4, T^2, (ST)^2, (S^2T)^2&gt;.
 * @author Sean A. Irvine
 */
public class A377946 extends A377573 {

  /** Construct the sequence. */
  public A377946() {
    super(GroupFactory.createGroup("C2^2:C4"), 2, 0);
  }
}

