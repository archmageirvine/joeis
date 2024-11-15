package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377944 Cogrowth sequence of the 16-element dicyclic group Q16 = &lt;S,T | S^8, T^4, (ST)^4, TST^3S&gt;.
 * @author Sean A. Irvine
 */
public class A377944 extends A377573 {

  /** Construct the sequence. */
  public A377944() {
    super(GroupFactory.createGroup("Q16"), 2, 0);
  }
}

