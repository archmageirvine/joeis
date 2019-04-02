package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006416 Number of rooted planar maps. Also a(n)=T(4,n-3), array T as in A049600.
 * @author Sean A. Irvine
 */
public class A006416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006416() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 20, 38});
  }
}

