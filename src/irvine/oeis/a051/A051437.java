package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051437 Number of undirected walks of length <code>n+1</code> on an oriented triangle, visiting <code>n+2</code> vertices, with n "corners"; the symmetry group is C3. Walks are not self-avoiding.
 * @author Sean A. Irvine
 */
public class A051437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051437() {
    super(new long[] {-4, 2, 2}, new long[] {1, 3, 4});
  }
}
