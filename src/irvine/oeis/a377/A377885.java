package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377885 Cogrowth sequence of the 16-element quasihedral group SD16 = &lt;S,T | S^8, T^2, STS^5T&gt;.
 * @author Sean A. Irvine
 */
public class A377885 extends A377573 {

  /** Construct the sequence. */
  public A377885() {
    super(GroupFactory.createGroup("SD16"), 2, 0);
  }
}

