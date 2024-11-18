package irvine.oeis.a378;

import irvine.math.group.GroupFactory;
import irvine.oeis.a377.A377573;

/**
 * A378031 Cogrowth sequence for the 18-element group C6 X C3 = &lt;S,T | S^6, T^3, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A378031 extends A377573 {

  /** Construct the sequence. */
  public A378031() {
    super(GroupFactory.createGroup("C3xC6"), 3, 0);
  }
}

