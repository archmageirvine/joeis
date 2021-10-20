package irvine.oeis.a122;
// manually 2021-10-19

import irvine.oeis.triangle.Triangle;

/**
 * A122218 Pascal array A(n,p,k) for selection of k elements from two sets L and U with n elements in total whereat the nl = n - p elements in L are labeled and the nu = p elements in U are unlabeled and (in this example) with p = 2 (read by rows).
 * @author Georg Fischer
 */
public class A122218 extends Triangle {

  /** Construct the sequence. */
  public A122218() {
    super("0, 0, 0, 1, 1, 1");
  }
}
