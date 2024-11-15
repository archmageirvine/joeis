package irvine.oeis.a378;

import irvine.math.group.GroupFactory;
import irvine.oeis.a377.A377573;

/**
 * A377840 Cogrowth sequence of the 16-element group C8 X C2 = &lt;S,T | S^8, T^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A378031 extends A377573 {

  /** Construct the sequence. */
  public A378031() {
    super(GroupFactory.createGroup("C3xC6"), 3, 0);
  }
}

