package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377883 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A377883 extends A377573 {

  /** Construct the sequence. */
  public A377883() {
    super(GroupFactory.createGroup("M4(2)"), 2, 0);
  }
}

