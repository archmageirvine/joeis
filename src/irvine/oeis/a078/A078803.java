package irvine.oeis.a078;
// manually partran at 2022-10-17 20:25

import irvine.oeis.a130.A130716;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A078803 Triangular array T given by T(n,k) = number of compositions of n into k parts, each in the set {1,2,3}.
 * @author Georg Fischer
 */
public class A078803 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A078803() {
    super(1, new A130716());
  }
}
