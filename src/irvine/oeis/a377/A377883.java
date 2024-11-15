package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377883 Cogrowth sequence of the 16-element modular group M4(2) = &lt;S,T | S^8, T^2, STS^3T&gt;.
 * @author Sean A. Irvine
 */
public class A377883 extends A377573 {

  /** Construct the sequence. */
  public A377883() {
    super(GroupFactory.createGroup("M4(2)"), 2, 0);
  }
}

