package irvine.oeis.a339;

import irvine.oeis.a000.A000081;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A339067 Triangle read by rows: T(n,k) is the number of linear forests with n nodes and k rooted trees.
 * @author Georg Fischer
 */
public class A339067 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A339067() {
    super(1, new A000081(), 1);
  }
}
